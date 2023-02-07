package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Role;
import com.example.demo.repository.RoleRepository;

@RestController
public class RoleController {
	@Autowired
	RoleRepository roleRepository;
	
	@PostMapping("/roles")
	public Role saveall(@RequestBody Role roles){
		return roleRepository.save(roles);
	}
		
	@GetMapping("/roles")
	public List<Role> getall(Role roles){
		return roleRepository.findAll();
	}
}
