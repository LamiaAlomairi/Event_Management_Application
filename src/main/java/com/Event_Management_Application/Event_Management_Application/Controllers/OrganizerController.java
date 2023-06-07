package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Organizer;
import com.Event_Management_Application.Event_Management_Application.Services.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "organizer")
public class OrganizerController {
    //    http://localhost:8080/organizer/getAll
    @Autowired
    OrganizerService organizerService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Organizer> getAllOrganizers() {

        return organizerService.getAllOrganizers();
    }
    @GetMapping(value = "getById")
    public Organizer getOrganizerById(@RequestParam Long id) {

        return organizerService.getOrganizerById(id);
    }
}