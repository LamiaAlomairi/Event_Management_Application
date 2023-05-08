package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Organizer;
import com.Event_Management_Application.Event_Management_Application.Services.Organizer_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "organizer")
public class Organizer_Controller {
    //    http://localhost:8080/organizer/getAll
    @Autowired
    Organizer_Service organizer_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Organizer> getAllOrganizers() {

        return organizer_service.getAllOrganizers();
    }
    @GetMapping(value = "getById")
    public Organizer getOrganizerById(@RequestParam Long id) {

        return organizer_service.getOrganizerById(id);
    }
}