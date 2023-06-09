package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Venue;
import com.Event_Management_Application.Event_Management_Application.Services.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "venue")
public class VenueController {
    //    http://localhost:8080/venue/getAll
    @Autowired
    VenueService venueService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Venue> getAllVenues() {

        return venueService.getAllVenues();
    }
    @GetMapping(value = "getById")
    public Venue getVenueById(@RequestParam Long id) {

        return venueService.getVenueById(id);
    }
}
