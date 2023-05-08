package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Schedule;
import com.Event_Management_Application.Event_Management_Application.Repositories.Schedule_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Schedule_Service {
    @Autowired
    Schedule_Repository schedule_repository;
    public List<Schedule> getAllSchedules() {

        return schedule_repository.findAll();
    }

    public Schedule getScheduleById(Long id) {

        return schedule_repository.findById(id).get();
    }
}
