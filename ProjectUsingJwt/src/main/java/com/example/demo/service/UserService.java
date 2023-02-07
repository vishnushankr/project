package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RoleDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.exception.BadRequestException;
import com.example.demo.exception.UsedException;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.mail.internet.MimeMessage;

@Service
public class UserService {
   
	@Autowired
	private JavaMailSender mailSenderObj;

	
    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;
Date date=new Date();
    public void initRoleAndUser() {

//        Role adminRole = new Role();
//        adminRole.setRoleName("Admin");
//        adminRole.setRoleDescription("Admin role");
//        roleDao.save(adminRole);
//
//        Role userRole = new Role();
//        userRole.setRoleName("User");
//        userRole.setRoleDescription("Default role for newly created record");
//        roleDao.save(userRole);
//        
//        Role userRole1 = new Role();
//        userRole1.setRoleName("Manager");
//        userRole1.setRoleDescription("Manager");
//        roleDao.save(userRole1);
//        
//        Role userRole2 = new Role();
//        userRole2.setRoleName("Teamlead");
//        userRole2.setRoleDescription("lead");
//        roleDao.save(userRole2);
//
//        User adminUser = new User();
//        adminUser.setUserName("admin123");
//        adminUser.setUserPassword(getEncodedPassword("admin@pass"));
//        adminUser.setFirstname("super");
//        adminUser.setLastname("admin");
//        
//        Set<Role> adminRoles = new HashSet<>();
//        adminRoles.add(adminRole);
//        adminUser.setRole(adminRoles);
//        userDao.save(adminUser);

//        User user = new User();
//        user.setUserName("raj123");
//        user.setUserPassword(getEncodedPassword("raj@123"));
//        user.setUserFirstName("raj");
//        user.setUserLastName("sharma");
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(userRole);
//        user.setRole(userRoles);
//        userDao.save(user);
    }

    public User registerNewUser(User user) {
//        Role role = roleDao.findByRoleName("User");
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(role);
//        user.setRole(userRoles);
//        user.setUserPassword(getEncodedPassword(user.getUserPassword()));
//
//        return userDao.save(user);
    	
    	Role role =roleDao.findByRoleName("User");
        Set<Role>userRole=new HashSet<>();
        userRole.add(role);
        
        User Emp=user;
		if (Emp.getFirstname().isEmpty() || Emp.getLastname().isEmpty() || Emp.getEmail().isEmpty()
				|| Emp.getGender().isEmpty() || Emp.getUserName().isEmpty() || Emp.getUserPassword().isEmpty()) {
			throw new BadRequestException("please fill All The Details");
		}
		String uname1 = Emp.getUserName();
		String email1 = Emp.getEmail();
		List<User> emp1 = userDao.findAll();
		for (int i = 0; i < emp1.size(); i++) {
			String uname2 = emp1.get(i).getUserName();
			String email2 = emp1.get(i).getEmail();
			if (email1.equals(email2) || uname1.equals(uname2)) {
				throw new UsedException("Email or UserName is already exists");
			}
		}
        Emp.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
        Emp.setRole(userRole);
        Emp.setCreated_by("SUPER_ADMIN");
        Emp.setCreated_date(date);
        Emp.setUpdated_by(null);
        Emp.setUpdated_date(null);
		sendmail(Emp);
        return userDao.save(Emp);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
    
    private void sendmail(User employee) {
		final String emailToRecipient = employee.getEmail();
		final String emailSubject = "Registration Successfull";
		final String emailMessage1 = "<html> <body> <p>You have been Successfully Registred" + "<br><br>"
				+ " <h2>Registration details</h2>"
				+ "<table border='1' width='300px' style='text-align:center;font-size:20px;'>"
				+ "<tr><td>User Name</td><td>" + employee.getUserName()+ "</td></tr><tr><td>Password</td><td>"
				+ employee.getUserPassword() + "</td></tr><tr><td>Gender</td><td>" + employee.getGender()
				+ "</td></tr><tr><td>Mobile</td><td>" + employee.getMobile() + "</table>"
				+ "<p>Login to Your Account Using your Username and Password</p>" + "<br>" + "<p>Thanks and regards</p>"
				+ "<p>Stratapps Solutions Pvt Ltd</body></html>";
		mailSenderObj.send(new MimeMessagePreparator() {
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {

				MimeMessageHelper mimeMsgHelperObj = new MimeMessageHelper(mimeMessage, true, "UTF-8");

				mimeMsgHelperObj.setTo(emailToRecipient);
				mimeMsgHelperObj.setText(emailMessage1, true);
				mimeMsgHelperObj.setSubject(emailSubject);
			}
		});
	}
    public List<User> getAllEmployees(){
		return userDao.findAll();
	}
   
}
