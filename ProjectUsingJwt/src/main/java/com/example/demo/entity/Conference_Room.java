package com.example.demo.entity;
import java.util.Date;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="conference_room")
public class Conference_Room {
	@Id
	@Column(name="room_id")
	private long roomid;
	@Column(name="name")
	private String name;
	@Column(name="floor")
	private int floor;
	@Column(name="capacity")
	private int capacity;
	@Column(name="created_by")
	private String createdby;
	@Column(name="updated_by")
	private String updatedby;
	@Column(name="created_date")
	private Date createddate;
	@Column(name="updated_date")
	private Date updateddate;
	
	@OneToMany(mappedBy ="conference",fetch = FetchType.LAZY,cascade={CascadeType.DETACH,
	        CascadeType.MERGE,
	        CascadeType.PERSIST,
	        CascadeType.REFRESH,
	        CascadeType.REMOVE})
	@JsonIgnore 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

	private Set<Booking_data> booking;

	public long getRoomid() {
		return roomid;
	}

	public void setRoomid(long roomid) {
		this.roomid = roomid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Date getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}

	public Set<Booking_data> getBooking() {
		return booking;
	}

	public void setBooking(Set<Booking_data> booking) {
		this.booking = booking;
}
}
