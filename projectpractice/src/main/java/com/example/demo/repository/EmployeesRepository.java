package com.example.demo.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {


	Employees findByEmail(Employees employees);








	Employees findByUserName(String userName);








//	Long findById(Employees employee);








//	Employees findById(Employees employees);








//	Employees findById(Employees eid);









//@Query("select emp from Employees emp where emp.role_id= :role_id")
//public List<Employees> findByrole_id(int role_id);
//
//@Query("select emp from Employee emp where emp.gender=: role_id")
//public Employees findByGender(String gender);


}
