package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Ticket;
import com.Event_Management_Application.Event_Management_Application.Services.Ticket_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "ticket")
public class Ticket_Controller {
    //    http://localhost:8080/ticket/getAll
    @Autowired
    Ticket_Service ticket_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Ticket> getAllTickets() {

        return ticket_service.getAllTickets();
    }
    @GetMapping(value = "getById")
    public Ticket getTicketById(@RequestParam Long id) {

        return ticket_service.getTicketById(id);
    }
}
