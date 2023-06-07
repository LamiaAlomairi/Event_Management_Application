package com.Event_Management_Application.Event_Management_Application.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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
    Boolean manufacturersType;
    Boolean wholesalersType;
    Boolean retailersType;
    Boolean maintenanceType;
    Boolean serviceType;

    @ManyToMany(mappedBy = "vendors")
    @JsonIgnore
    private List<Event> events;
}
