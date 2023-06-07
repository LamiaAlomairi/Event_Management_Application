package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Ticket;
import com.Event_Management_Application.Event_Management_Application.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "ticket")
public class TicketController {
    //    http://localhost:8080/ticket/getAll
    @Autowired
    TicketService ticketService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Ticket> getAllTickets() {

        return ticketService.getAllTickets();
    }
    @GetMapping(value = "getById")
    public Ticket getTicketById(@RequestParam Long id) {

        return ticketService.getTicketById(id);
    }
}
