package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Conference_Room;

public interface ConferenceDao extends JpaRepository<Conference_Room,Long>{

}
