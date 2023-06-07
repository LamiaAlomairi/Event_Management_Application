package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Attendee;
import com.Event_Management_Application.Event_Management_Application.Services.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "attendee")
public class AttendeeController {
    //    http://localhost:8080/attendee/getAll
    @Autowired
    AttendeeService attendeeService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Attendee> getAllAttendees() {

        return attendeeService.getAllAttendees();
    }
    @GetMapping(value = "getById")
    public Attendee getAttendeeById(@RequestParam Long id) {

        return attendeeService.getAttendeeById(id);
    }
}
