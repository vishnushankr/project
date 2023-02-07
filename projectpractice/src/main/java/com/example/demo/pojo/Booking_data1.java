package com.example.demo.pojo;

import java.util.Date;

import com.example.demo.model.Conference_Room;
import com.example.demo.model.Employees;




public class Booking_data1 {
	
	private long bookingid;

	private String title;

	private Date startingtime;

	private Date endtime;

	private String createdby;

	private String updtaedby;

	private Date createdtime;
	
	private Date updatedtime;
	
	private Conference_Room conference;

	
	private Employees employee;


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


	

}
