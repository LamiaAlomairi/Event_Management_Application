package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Attendee;
import com.Event_Management_Application.Event_Management_Application.Repositories.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendeeService {
    @Autowired
    AttendeeRepository attendeeRepository;
    public List<Attendee> getAllAttendees() {

        return attendeeRepository.findAll();
    }

    public Attendee getAttendeeById(Long id) {

        return attendeeRepository.findById(id).get();
    }
}
