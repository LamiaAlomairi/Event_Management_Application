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
@Table(name = "venue")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String address;
    String capacity;
    String email;
    Integer phone;

    @OneToMany(mappedBy = "venue")
    @JsonIgnore
    private List<Event> events;

    @OneToMany(mappedBy = "venue")
    @JsonIgnore
    private List<Organizer> organizers;
}
