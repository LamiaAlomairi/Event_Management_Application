package com.Event_Management_Application.Event_Management_Application.Repositories;

import com.Event_Management_Application.Event_Management_Application.Models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Event_Repository extends JpaRepository<Event, Long> {
}
