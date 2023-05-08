package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Event;
import com.Event_Management_Application.Event_Management_Application.Repositories.Event_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Event_Service {
    @Autowired
    Event_Repository event_repository;
    public List<Event> getAllEvents() {

        return event_repository.findAll();
    }

    public Event getEventById(Long id) {

        return event_repository.findById(id).get();
    }
}
