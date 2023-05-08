package com.Event_Management_Application.Event_Management_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "vendor")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Boolean manufacturers_type;
    Boolean wholesalers_type;
    Boolean retailers_type;
    Boolean maintenance_type;
    Boolean service_type;
}
