package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Ticket;
import com.Event_Management_Application.Event_Management_Application.Repositories.Ticket_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ticket_Service {
    @Autowired
    Ticket_Repository ticket_repository;
    public List<Ticket> getAllTickets() {

        return ticket_repository.findAll();
    }

    public Ticket getTicketById(Long id) {

        return ticket_repository.findById(id).get();
    }
}
