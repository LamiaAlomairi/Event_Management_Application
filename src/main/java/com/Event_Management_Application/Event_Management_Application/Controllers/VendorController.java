package com.Event_Management_Application.Event_Management_Application.Controllers;

import com.Event_Management_Application.Event_Management_Application.Models.Vendor;
import com.Event_Management_Application.Event_Management_Application.Services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "vendor")
public class VendorController {
    //    http://localhost:8080/vendor/getAll
    @Autowired
    VendorService vendorService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Vendor> getAllVendors() {

        return vendorService.getAllVendors();
    }
    @GetMapping(value = "getById")
    public Vendor getVendorById(@RequestParam Long id) {

        return vendorService.getVendorById(id);
    }
}