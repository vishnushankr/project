package com.example.demo.dao;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Booking_data;
import com.example.demo.entity.Conference_Room;
import com.example.demo.entity.User;

public interface BookingDao extends JpaRepository<Booking_data,Long>{
	List<Booking_data> findByconference(Conference_Room conference);

	Booking_data findByemployee(User eid);

}
