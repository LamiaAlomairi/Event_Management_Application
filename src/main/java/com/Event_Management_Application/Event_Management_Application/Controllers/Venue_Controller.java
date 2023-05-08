package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Venue;
import com.Event_Management_Application.Event_Management_Application.Services.Venue_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "venue")
public class Venue_Controller {
    //    http://localhost:8080/venue/getAll
    @Autowired
    Venue_Service venue_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Venue> getAllVenues() {

        return venue_service.getAllVenues();
    }
    @GetMapping(value = "getById")
    public Venue getVenueById(@RequestParam Long id) {

        return venue_service.getVenueById(id);
    }
}
