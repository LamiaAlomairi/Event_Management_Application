package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Schedule;
import com.Event_Management_Application.Event_Management_Application.Services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "schedule")
public class ScheduleController {
    //    http://localhost:8080/schedule/getAll
    @Autowired
    ScheduleService scheduleService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Schedule> getAllSchedules() {

        return scheduleService.getAllSchedules();
    }
    @GetMapping(value = "getById")
    public Schedule getScheduleById(@RequestParam Long id) {

        return scheduleService.getScheduleById(id);
    }
}