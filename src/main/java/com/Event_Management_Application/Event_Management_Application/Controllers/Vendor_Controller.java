package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Vendor;
import com.Event_Management_Application.Event_Management_Application.Services.Vendor_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "vendor")
public class Vendor_Controller {
    //    http://localhost:8080/vendor/getAll
    @Autowired
    Vendor_Service vendor_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Vendor> getAllVendors() {

        return vendor_service.getAllVendors();
    }
    @GetMapping(value = "getById")
    public Vendor getVendorById(@RequestParam Long id) {

        return vendor_service.getVendorById(id);
    }
}