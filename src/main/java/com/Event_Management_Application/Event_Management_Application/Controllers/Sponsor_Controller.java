package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Sponsor;
import com.Event_Management_Application.Event_Management_Application.Services.Sponsor_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "sponsor")
public class Sponsor_Controller {
    //    http://localhost:8080/sponsor/getAll
    @Autowired
    Sponsor_Service sponsor_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Sponsor> getAllSponsors() {

        return sponsor_service.getAllSponsors();
    }
    @GetMapping(value = "getById")
    public Sponsor getSponsorById(@RequestParam Long id) {

        return sponsor_service.getSponsorById(id);
    }
}