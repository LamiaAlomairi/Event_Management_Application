package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Ticket;
import com.Event_Management_Application.Event_Management_Application.Repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    TicketRepository ticketRepository;
    public List<Ticket> getAllTickets() {

        return ticketRepository.findAll();
    }

    public Ticket getTicketById(Long id) {

        return ticketRepository.findById(id).get();
    }
}
