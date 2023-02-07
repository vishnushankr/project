package com.example.demo.repository;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Booking_data;
import com.example.demo.model.Conference_Room;
import com.example.demo.model.Employees;

public interface BookingRepository extends JpaRepository<Booking_data, Long>{



//	@Query("select book from booking book where book.room_id= :roomid")
//    public Optional<Booking_data> findByconference(@Param("roomid" )long conference);
//    }
	
//	@Query(value="SELECT * FROM public.booking "+
//            "WHERE room_id = :roomid",nativeQuery=true)
List<Booking_data> findByconference(Conference_Room conference);
List<Booking_data> findById(long bookingid);
Booking_data findByemployee(Employees eid);
}
