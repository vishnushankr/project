package com.example.demo.model;


import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="booking")

//@SecondaryTables({
//	  @SecondaryTable(name="B", @PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")),  
//	  @SecondaryTable(name="C",  @PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID"))
//	})
//@SecondaryTables({
//	  @SecondaryTable(name="Conference_Room",
//	      @PrimaryKeyJoinColumn(name="ACTION_OBJID", referencedColumnName="objid"))
//	  })
//@SecondaryTables({
//    @SecondaryTable(name = "commit_table", pkJoinColumns = {@PrimaryKeyJoinColumn(name="Id"), @PrimaryKeyJoinColumn(name="Hash")})
//})

//-------------------------------------------------------------------------------------------------------------------------------------
//@SecondaryTables({
//    @SecondaryTable(name = "three", pkJoinColumns = 
//    	{@PrimaryKeyJoinColumn(name="User_Id", referencedColumnName = "eid"), 
//    			@PrimaryKeyJoinColumn(name="Room_Id", referencedColumnName = "romid")})
//})

//@SecondaryTables({
//    @SecondaryTable(name = "", pkJoinColumns = 
//    	{@PrimaryKeyJoinColumn(name="Id", referencedColumnName = "Id") 
//    		 	}),
//    @SecondaryTable(name = "", pkJoinColumns = 
//	{@PrimaryKeyJoinColumn(name="Id", referencedColumnName = "Id")
//	})
//})
public class Booking_data {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="booking_id")
private long bookingid;

@Column(name="title")
private String title;

@Column(name="start_time")
@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
@Temporal(TemporalType.TIMESTAMP)
//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
private Date startingtime;

@Column(name="end_time" )
@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
@Temporal(TemporalType.TIMESTAMP)
private Date endtime;


@Column(name="created_by")
private String createdby;

@Column(name="updated_by")
private String updtaedby;

@Column(name="created_time")
@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
private Date createdtime;

@Column(name="updated_time")
@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
private Date updatedtime;

//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
//@ManyToMany(fetch = FetchType.EAGER, cascade ={CascadeType.DETACH,
//        CascadeType.MERGE,
//        
//        CascadeType.REFRESH,
//        CascadeType.REMOVE})
//@JoinTable(name = "user_booking",
//        joinColumns = {
//                @JoinColumn(name = "BOOKING_ID")
//        },
//        inverseJoinColumns = {
//                @JoinColumn(name = "USER_ID")
//        }
//)
//private Set<Employees> employee;




//@ManyToMany(fetch = FetchType.EAGER, cascade ={CascadeType.DETACH,
//        CascadeType.MERGE,
//        
//        CascadeType.REFRESH,
//        CascadeType.REMOVE})
//@JoinTable(name = "booking_conference",
//        joinColumns = {
//                @JoinColumn(name = "BOOKING_ID")
//        },
//        inverseJoinColumns = {
//                @JoinColumn(name = "ROOM_ID")
//        })
//private Set<Conference_Room> data;

//@OneToMany(mappedBy = "book")
//private Set<User_Booking_Room> categoryArticleSet;


//
//
//public void setStartingtime(Date startingtime) {
//	this.startingtime = startingtime;
//}
//
//
//
//public void setEndtime(Date endtime) {
//	this.endtime = endtime;
//}



@ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.DETACH,
        CascadeType.MERGE,
        CascadeType.REFRESH,
        CascadeType.REMOVE})
@JoinColumn(name = "USER_ID")

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
private Employees employee;



@ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.DETACH,
        CascadeType.MERGE,
        CascadeType.REFRESH,
        CascadeType.REMOVE})
@JoinColumn(name = "ROOM_ID")
 
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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



//public String getStartingtime() {
//	return startingtime;
//}



//public void setStartingtime(String startingtime) {
//	this.startingtime = startingtime;
//}



//public String getEndtime() {
//	return endtime;
//}



//public void setEndtime(String endtime) {
//	this.endtime = endtime;
//}



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



public Employees getEmployee() {
	return employee;
}



public void setEmployee(Employees employee) {
	this.employee = employee;
}



public Conference_Room getConference() {
	return conference;
}



public void setConference(Conference_Room conference) {
	this.conference = conference;
}










//@Override
//public String toString() {
//	return "Booking_data [bookingid=" + bookingid + ", title=" + title + ", startingtime=" + startingtime + ", endtime="
//			+ endtime + ", createdby=" + createdby + ", updtaedby=" + updtaedby + ", createdtime=" + createdtime
//			+ ", updatedtime=" + updatedtime + ", s=" + s + ", e=" + e + ", employee=" + employee + ", conference="
//			+ conference + "]";
//}










}







//public Set<Employees> getEmployee() {
//	return employee;
//}
//
//
//public void setEmployee(Set<Employees> employee) {
//	this.employee = employee;
//}
//
//
//public Set<Conference_Room> getData() {
//	return data;
//}
//
//
//public void setData(Set<Conference_Room> data) {
//	this.data = data;
//}



