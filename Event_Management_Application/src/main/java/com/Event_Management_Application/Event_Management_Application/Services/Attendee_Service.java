package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Attendee;
import com.Event_Management_Application.Event_Management_Application.Repositories.Attendee_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Attendee_Service {
    @Autowired
    Attendee_Repository attendee_repository;
    public List<Attendee> getAllAttendees() {

        return attendee_repository.findAll();
    }

    public Attendee getAttendeeById(Long id) {

        return attendee_repository.findById(id).get();
    }
}
