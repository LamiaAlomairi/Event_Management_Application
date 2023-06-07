package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Organizer;
import com.Event_Management_Application.Event_Management_Application.Repositories.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizerService {
    @Autowired
    OrganizerRepository organizerRepository;
    public List<Organizer> getAllOrganizers() {

        return organizerRepository.findAll();
    }

    public Organizer getOrganizerById(Long id) {

        return organizerRepository.findById(id).get();
    }
}
