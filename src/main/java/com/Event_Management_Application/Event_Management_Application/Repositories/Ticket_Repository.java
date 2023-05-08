package com.Event_Management_Application.Event_Management_Application.Repositories;

import com.Event_Management_Application.Event_Management_Application.Models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Ticket_Repository extends JpaRepository<Ticket, Long> {
}
