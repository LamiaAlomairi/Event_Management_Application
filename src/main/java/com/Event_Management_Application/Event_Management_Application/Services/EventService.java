package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Event;
import com.Event_Management_Application.Event_Management_Application.Repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;
    public List<Event> getAllEvents() {

        return eventRepository.findAll();
    }

    public Event getEventById(Long id) {

        return eventRepository.findById(id).get();
    }
}
