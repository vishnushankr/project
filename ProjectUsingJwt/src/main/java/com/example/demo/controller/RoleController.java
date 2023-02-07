package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.RoleDao;
import com.example.demo.entity.Role;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.service.RoleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class RoleController {

    @Autowired
    private RoleService roleService;
    
    @Autowired
    private RoleDao roleDao;

    @PostMapping({"/createNewRole"})
    public Role createNewRole(@RequestBody Role role) {
        return roleService.createNewRole(role);
    }
    
    @GetMapping("/roles")
    public List<Role> getAllRoles() {
		return roleDao.findAll();
    	
    }
        @PutMapping("/roles/{roleId}")
    	public ResponseEntity<Role> updateEmployee(@PathVariable Long roleId, @RequestBody Role employeedetails){
    		
    		Role employee=roleDao.findById(roleId)
    				.orElseThrow(()-> new ResourceNotFoundException("employee not exist wit id:"+roleId));
    		
    		employee.setRoleName(employeedetails.getRoleName());
    		employee.setRoleDescription(employeedetails.getRoleDescription());
    		
    	Role  updatedEmployee=	roleDao.save(employee);
    	return ResponseEntity.ok(updatedEmployee);
    	}
    }


