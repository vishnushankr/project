package com.example.demo.pojo;

import java.util.Date;
import java.util.Set;

import com.example.demo.model.Booking_data;
import com.example.demo.model.Role;



public class Employees1 {
	private long eid;
	private String firstname;
	private String lastname;
	private String gender;
	private String email;
	private Long mobile;
	private String userName;
	private String userPassword;
	private String created_by;
	private String Updated_by;
	private  Date Created_date;
	private Date updated_date;
	private Set<Role> role;
    private Set<Booking_data> data;

	
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getUpdated_by() {
		return Updated_by;
	}
	public void setUpdated_by(String updated_by) {
		Updated_by = updated_by;
	}
	public Date getCreated_date() {
		return Created_date;
	}
	public void setCreated_date(Date created_date) {
		Created_date = created_date;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
	public Set<Role> getRole() {
		return role;
	}
	public void setRole(Set<Role> role) {
		this.role = role;
	}
	public Set<Booking_data> getData() {
		return data;
	}
	public void setData(Set<Booking_data> data) {
		this.data = data;
	}
	
	
}
