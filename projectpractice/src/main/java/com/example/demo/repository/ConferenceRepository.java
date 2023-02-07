package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Conference_Room;

public interface ConferenceRepository extends JpaRepository<Conference_Room, Long> {
	
	
}
