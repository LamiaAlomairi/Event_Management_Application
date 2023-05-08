package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Schedule;
import com.Event_Management_Application.Event_Management_Application.Services.Schedule_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "schedule")
public class Schedule_Controller {
    //    http://localhost:8080/schedule/getAll
    @Autowired
    Schedule_Service schedule_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Schedule> getAllSchedules() {

        return schedule_service.getAllSchedules();
    }
    @GetMapping(value = "getById")
    public Schedule getScheduleById(@RequestParam Long id) {

        return schedule_service.getScheduleById(id);
    }
}