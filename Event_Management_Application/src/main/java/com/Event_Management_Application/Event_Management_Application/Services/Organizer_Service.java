package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Organizer;
import com.Event_Management_Application.Event_Management_Application.Repositories.Organizer_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Organizer_Service {
    @Autowired
    Organizer_Repository organizer_repository;
    public List<Organizer> getAllOrganizers() {

        return organizer_repository.findAll();
    }

    public Organizer getOrganizerById(Long id) {

        return organizer_repository.findById(id).get();
    }
}
