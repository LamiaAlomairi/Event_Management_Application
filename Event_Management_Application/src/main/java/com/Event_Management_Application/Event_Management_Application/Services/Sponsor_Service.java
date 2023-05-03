package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Sponsor;
import com.Event_Management_Application.Event_Management_Application.Repositories.Sponsor_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sponsor_Service {
    @Autowired
    Sponsor_Repository sponsor_repository;
    public List<Sponsor> getAllSponsors() {

        return sponsor_repository.findAll();
    }

    public Sponsor getSponsorById(Long id) {

        return sponsor_repository.findById(id).get();
    }
}
