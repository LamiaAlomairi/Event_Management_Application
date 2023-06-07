package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Venue;
import com.Event_Management_Application.Event_Management_Application.Repositories.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueService {
    @Autowired
    VenueRepository venueRepository;
    public List<Venue> getAllVenues() {

        return venueRepository.findAll();
    }

    public Venue getVenueById(Long id) {

        return venueRepository.findById(id).get();
    }
}
