package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Schedule;
import com.Event_Management_Application.Event_Management_Application.Repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {
    @Autowired
    ScheduleRepository scheduleRepository;
    public List<Schedule> getAllSchedules() {

        return scheduleRepository.findAll();
    }

    public Schedule getScheduleById(Long id) {

        return scheduleRepository.findById(id).get();
    }
}
