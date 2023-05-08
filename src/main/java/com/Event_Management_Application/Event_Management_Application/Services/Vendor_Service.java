package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Vendor;
import com.Event_Management_Application.Event_Management_Application.Repositories.Vendor_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Vendor_Service {
    @Autowired
    Vendor_Repository vendor_repository;
    public List<Vendor> getAllVendors() {

        return vendor_repository.findAll();
    }

    public Vendor getVendorById(Long id) {

        return vendor_repository.findById(id).get();
    }
}
