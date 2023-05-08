package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Attendee;
import com.Event_Management_Application.Event_Management_Application.Services.Attendee_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "attendee")
public class Attendee_Controller {
    //    http://localhost:8080/attendee/getAll
    @Autowired
    Attendee_Service attendee_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Attendee> getAllAttendees() {

        return attendee_service.getAllAttendees();
    }
    @GetMapping(value = "getById")
    public Attendee getAttendeeById(@RequestParam Long id) {

        return attendee_service.getAttendeeById(id);
    }
}
