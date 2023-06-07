package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Sponsor;
import com.Event_Management_Application.Event_Management_Application.Services.SponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "sponsor")
public class SponsorController {
    //    http://localhost:8080/sponsor/getAll
    @Autowired
    SponsorService sponsorService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Sponsor> getAllSponsors() {

        return sponsorService.getAllSponsors();
    }
    @GetMapping(value = "getById")
    public Sponsor getSponsorById(@RequestParam Long id) {

        return sponsorService.getSponsorById(id);
    }
}