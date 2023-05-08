package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Vendor;
import com.Event_Management_Application.Event_Management_Application.Models.Venue;
import com.Event_Management_Application.Event_Management_Application.Repositories.Vendor_Repository;
import com.Event_Management_Application.Event_Management_Application.Repositories.Venue_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Venue_Service {
    @Autowired
    Venue_Repository venue_repository;
    public List<Venue> getAllVenues() {

        return venue_repository.findAll();
    }

    public Venue getVenueById(Long id) {

        return venue_repository.findById(id).get();
    }
}
