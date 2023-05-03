package com.Event_Management_Application.Event_Management_Application.Repositories;

import com.Event_Management_Application.Event_Management_Application.Models.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Attendee_Repository extends JpaRepository<Attendee, Long> {
}
