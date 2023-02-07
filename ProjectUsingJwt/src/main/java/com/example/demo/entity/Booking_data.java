package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "booking")

public class Booking_data {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id")
	private long bookingid;

	@Column(name = "title")
	private String title;

	@Column(name = "start_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date startingtime;

	@Column(name = "end_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date endtime;

	@Column(name = "created_by")
	private String createdby;

	@Column(name = "updated_by")
	private String updtaedby;

	@Column(name = "created_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date createdtime;

	@Column(name = "updated_time")
//	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date updatedtime;
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH, CascadeType.MERGE,

			CascadeType.REFRESH, CascadeType.REMOVE })
	@JoinColumn(name = "USER_ID")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private User employee;
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.PERSIST,	CascadeType.REMOVE })
	@JoinColumn(name = "ROOM_ID")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Conference_Room conference;

	public long getBookingid() {
		return bookingid;
	}

	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartingtime() {
		return startingtime;
	}

	public void setStartingtime(Date startingtime) {
		this.startingtime = startingtime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getUpdtaedby() {
		return updtaedby;
	}

	public void setUpdtaedby(String updtaedby) {
		this.updtaedby = updtaedby;
	}

	public Date getCreatedtime() {
		return createdtime;
	}

	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	public Date getUpdatedtime() {
		return updatedtime;
	}

	public void setUpdatedtime(Date updatedtime) {
		this.updatedtime = updatedtime;
	}

	public User getEmployee() {
		return employee;
	}

	public void setEmployee(User employee) {
		this.employee = employee;
	}

	public Conference_Room getConference() {
		return conference;
	}

	public void setConference(Conference_Room conference) {
		this.conference = conference;
	}
}