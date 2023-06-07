package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Vendor;
import com.Event_Management_Application.Event_Management_Application.Repositories.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {
    @Autowired
    VendorRepository vendorRepository;
    public List<Vendor> getAllVendors() {

        return vendorRepository.findAll();
    }

    public Vendor getVendorById(Long id) {

        return vendorRepository.findById(id).get();
    }
}
