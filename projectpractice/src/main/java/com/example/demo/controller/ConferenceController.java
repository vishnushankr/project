package com.example.demo.controller;

import java.util.Date;

import java.util.HashMap;
import java.util.List
;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.BadRequestException;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Exception.UsedException;
import com.example.demo.model.Conference_Room;
import com.example.demo.repository.ConferenceRepository;

@RestController
public class ConferenceController {
	Date date=new Date();

	@Autowired
	ConferenceRepository conferenceRepository;
	
	@PostMapping("/conference")
	public Conference_Room saveall(@RequestBody Conference_Room data){
		Conference_Room room=data;
		if(room.getName().isEmpty()) {
			throw new BadRequestException("Room name can't be empty"); 
		}
		String rname1=room.getName();
		List<Conference_Room> con=conferenceRepository.findAll();
		for(int i=0;i<con.size();i++) {
			String rname2=con.get(i).getName();
			if(rname1.equals(rname2)) {
				throw new UsedException("Room name Already Exits");
			}
		}
		room.setCreatedby("SuperAdmin");
		room.setCreateddate(date);
		room.setUpdatedby(null);
		room.setUpdateddate(null);
		return conferenceRepository.save(data);
	}
		
	@GetMapping("/conference")
	public List<Conference_Room> getall(Conference_Room data){
		return conferenceRepository.findAll();
	}
	
	@GetMapping("/conference/{roomid}")
	public 	ResponseEntity<Conference_Room> getEmployeeById(@PathVariable Long roomid) {
		Conference_Room room=conferenceRepository.findById(roomid)
				.orElseThrow(()-> new ResourceNotFoundException("room not exist wit id:"+roomid));
		return ResponseEntity.ok(room);
	}
    
    
    @PutMapping("/conference/{roomid}")
	public ResponseEntity<Conference_Room> updateEmployee(@PathVariable Long roomid, @RequestBody Conference_Room roomdetails){
		
		Conference_Room room=conferenceRepository.findById(roomid)
				.orElseThrow(()-> new ResourceNotFoundException("room not exist wit id:"+roomid));
		  String rname1=room.getName();
	        List<Conference_Room> rid=conferenceRepository.findAll();
	        for(int i=0;i<rid.size();i++) {
	        	String rname2=rid.get(i).getName();
	        	if(rname1.equals(rname2)) {
					throw new UsedException("Room name Already Exits");
	        	}
	        }
		
		room.setRoomid(roomdetails.getRoomid());
		room.setCapacity(roomdetails.getCapacity());
		room.setFloor(roomdetails.getFloor());
		room.setName(roomdetails.getName());
		room.setCreatedby(roomdetails.getCreatedby());
		room.setCreateddate(roomdetails.getCreateddate());
		room.setUpdatedby("SUPER_ADMIN");
		room.setUpdateddate(date);
		room.setBooking(roomdetails.getBooking());
		
		Conference_Room  updatedRoom =	conferenceRepository.save(room);
	return ResponseEntity.ok(updatedRoom);
	}
    
    @DeleteMapping("/conference/{roomid}")
	public  ResponseEntity <Map<String, Boolean>>deleteEmployee(@PathVariable Long roomid){
		Conference_Room room=conferenceRepository.findById(roomid)
				.orElseThrow(()-> new ResourceNotFoundException("room not exist wit id:"+roomid));
		conferenceRepository.delete(room);
		Map<String, Boolean> response=new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
		
	}
}
