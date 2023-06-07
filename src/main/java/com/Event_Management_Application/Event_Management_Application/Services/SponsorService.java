package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Sponsor;
import com.Event_Management_Application.Event_Management_Application.Repositories.SponsorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SponsorService {
    @Autowired
    SponsorRepository sponsorRepository;
    public List<Sponsor> getAllSponsors() {

        return sponsorRepository.findAll();
    }

    public Sponsor getSponsorById(Long id) {

        return sponsorRepository.findById(id).get();
    }
}
