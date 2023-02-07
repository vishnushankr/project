package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.service.UserService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class UserController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private UserDao userdao;

    Date date=new Date();
    
    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }

    @GetMapping({"/forAdmin"})
    @PreAuthorize("hasRole('Admin')")
//    public String forAdmin(){
//        return "This URL is only accessible to the Admin";
//    }
    public List<User> getAllEmployees(){
		return userService.getAllEmployees();
	}

    
    @GetMapping({"/forManager"})
    @PreAuthorize("hasRole('Manager')")
    public String forManager() {
    	return "this URL is only accessible to the manager";
    }
    
    @GetMapping({"/forTeamlead"})
    @PreAuthorize("hasRole('Teamlead')")
    public String forTeamlead() {
    	return "this URL is only accessible to the teamlead";
    }
    
    @GetMapping({"/forUser"})
    @PreAuthorize("hasRole('User')")
    public String forUser(){
        return "This URL is only accessible to the user";
    }
//    @GetMapping("/employees")
//    public List<User> getall(List<User> employees){
//    	return  (List<User>) userdao.findAll();
//    }
    
//    @GetMapping("/employees")
//    public List<User> getAllEmployees(){
//		return userService.getAllEmployees();
//	}
   
    @GetMapping("/employees/{eid}")
	public 	ResponseEntity<User> getEmployeeById(@PathVariable Long eid) {
		User employee=userdao.findById(eid)
				.orElseThrow(()-> new ResourceNotFoundException("employee not exist wit id:"+eid));
		return ResponseEntity.ok(employee);
	}
    
    
    @PutMapping("/employees/{eid}")
	public ResponseEntity<User> updateEmployee(@PathVariable Long eid, @RequestBody User employeedetails){
		
		User employee=userdao.findById(eid)
				.orElseThrow(()-> new ResourceNotFoundException("employee not exist wit id:"+eid));
		
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
	User  updatedEmployee=	userdao.save(employee);
	return ResponseEntity.ok(updatedEmployee);
	}
    
    @DeleteMapping("/employees/{eid}")
	public  ResponseEntity <Map<String, Boolean>>deleteEmployee(@PathVariable Long eid){
		User employee=userdao.findById(eid)
				.orElseThrow(()-> new ResourceNotFoundException("employee not exist wit id:"+eid));
		userdao.delete(employee);
		Map<String, Boolean> response=new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
		
	}
    }

