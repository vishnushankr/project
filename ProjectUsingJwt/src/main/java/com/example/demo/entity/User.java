package com.example.demo.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

@Entity
@Table(name="user_vis")
public class User {

//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
//    private String userName;
//    private String userFirstName;
//    private String userLastName;
//    private String userPassword;
//  
//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    @SequenceGenerator(name="seq",sequenceName="user_seq")        
//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq") 
//    private long userId;
//
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
//    @JoinTable(name = "USER_ROLE",
//            joinColumns = {
//                    @JoinColumn(name = "USER_ID")
//            },
//            inverseJoinColumns = {
//                    @JoinColumn(name = "ROLE_ID")
//            }
//    )
//    private Set<Role> role;
//
//    
//    
//   
//
//	public  long getUserId() {
//		return userId;
//	}
//
//	public void setUserId(long userId) {
//		this.userId = userId;
//	}
//
//	public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getUserFirstName() {
//        return userFirstName;
//    }
//
//    public void setUserFirstName(String userFirstName) {
//        this.userFirstName = userFirstName;
//    }
//
//    public String getUserLastName() {
//        return userLastName;
//    }
//
//    public void setUserLastName(String userLastName) {
//        this.userLastName = userLastName;
//    }
//
//    public String getUserPassword() {
//        return userPassword;
//    }
//
//    public void setUserPassword(String userPassword) {
//        this.userPassword = userPassword;
//    }
//
//    public Set<Role> getRole() {
//        return role;
//    }
//
//    public void setRole(Set<Role> role) {
//        this.role = role;
//    }
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="eid")
	private long eid;
	@Column(name="first_name")
	private String firstname;
	@Column(name="last_name")
	private String lastname;
	@Column(name="gender")
	private String gender;
	@Column(name="email")
	private String email;
	@Column(name="mobile")
	private Long mobile;
	@Column(name="username", unique = true)
	private String userName;
	@Column(name="password")	
	private String userPassword;
	@Column(name="created_by")
	private String created_by;
	@Column(name="updated_by")
	private String Updated_by;
	@Column(name="created_date")
	private  Date Created_date;
	@Column(name="updated_date")
	private Date updated_date;

	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH,
	        CascadeType.MERGE,
	        CascadeType.REFRESH,
	        CascadeType.REMOVE})
	@JoinTable(name = "USER_ROLE",
	        joinColumns = {
	                @JoinColumn(name = "USER_ID")
	        },
	        inverseJoinColumns = {
	                @JoinColumn(name = "ROLE_ID")
	        }
	)
	private Set<Role> role;
	@OneToMany(mappedBy = "employee",fetch = FetchType.LAZY,cascade={CascadeType.DETACH,
	        CascadeType.MERGE,
	        
	        CascadeType.REFRESH,
	        CascadeType.REMOVE})
	@JsonIgnore 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Set<Booking_data> data;

	public Set<Booking_data> getData() {
		return data;
	}

	public void setData(Set<Booking_data> data) {
		this.data = data;
	}

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

	

	

//	public static Object findById(Long eid) {
//		// TODO Auto-generated method stub
//		return null;
//	}




}