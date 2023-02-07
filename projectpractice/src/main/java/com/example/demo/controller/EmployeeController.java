package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.BadRequestException;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Exception.UsedException;
import com.example.demo.model.Booking_data;
import com.example.demo.model.Employees;
import com.example.demo.pojo.Employees1;
import com.example.demo.repository.EmployeesRepository;

@RestController
public class EmployeeController {

	Date date = new Date();
	@Autowired
	EmployeesRepository employeesRepository;
	@Autowired
	private JavaMailSender mailSenderObj;

	@PostMapping("/employees")
	public Employees saveall(@RequestBody Employees employees) {
		Employees emp = employees;
		if (emp.getFirstname().isEmpty() || emp.getLastname().isEmpty() || emp.getEmail().isEmpty()
				|| emp.getGender().isEmpty() || emp.getUserName().isEmpty() || emp.getUserPassword().isEmpty()) {
			throw new BadRequestException("please fill All The Details");
		}
		String uname1 = emp.getUserName();
		String email1 = emp.getEmail();
		List<Employees> emp1 = employeesRepository.findAll();
		for (int i = 0; i < emp1.size(); i++) {
			String uname2 = emp1.get(i).getUserName();
			String email2 = emp1.get(i).getEmail();
			if (email1.equals(email2) || uname1.equals(uname2)) {
				throw new UsedException("Email or UserName is already exists");
			}
		}
		emp.setCreated_date(date);
		emp.setCreated_by("SUPER_ADMIN");
		sendmail(emp);
		return employeesRepository.save(employees);
	}

	private void sendmail(Employees employee) {
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

	@GetMapping("/employees")
	public List<Employees> getall(Employees employees) {
		return employeesRepository.findAll();
	}

	@GetMapping("/employees/{eid}")
	public ResponseEntity<Employees> getEmployeeById(@PathVariable Long eid) {
		Employees employee = employeesRepository.findById(eid)
				.orElseThrow(() -> new ResourceNotFoundException("employee not exist wit id:" + eid));
		return ResponseEntity.ok(employee);
	}

	@PutMapping("/employees/{eid}")
	public ResponseEntity<Employees> updateEmployee(@PathVariable Long eid, @RequestBody Employees employeedetails) {

		Employees employee = employeesRepository.findById(eid)
				.orElseThrow(() -> new ResourceNotFoundException("employee not exist wit id:" + eid));
		
		String uname1 = employee.getUserName();
		String email1 = employee.getEmail();
		List<Employees> emp1 = employeesRepository.findAll();
		for (int i = 0; i < emp1.size(); i++) {
			String uname2 = emp1.get(i).getUserName();
			String email2 = emp1.get(i).getEmail();
			if (email1.equals(email2) || uname1.equals(uname2)) {
				throw new UsedException("Email or UserName is already exists");
			}
		}
		employee.setFirstname(employeedetails.getFirstname());
		employee.setLastname(employeedetails.getLastname());
		employee.setEmail(employeedetails.getEmail());
		employee.setGender(employeedetails.getGender());
		employee.setMobile(employeedetails.getMobile());
		employee.setUserName(employeedetails.getUserName());
		employee.setUserPassword(employeedetails.getUserPassword());
		employee.setCreated_by(employeedetails.getCreated_by());
		employee.setCreated_date(employeedetails.getCreated_date());
		employee.setUpdated_by("SUPER_ADMIN");
		employee.setUpdated_date(date);
		employee.setRole(employeedetails.getRole());
		Employees updatedEmployee = employeesRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}

	@DeleteMapping("/employees/{eid}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long eid) {
		Employees employee = employeesRepository.findById(eid)
				.orElseThrow(() -> new ResourceNotFoundException("employee not exist wit id:" + eid));
		employeesRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);

	}

}
