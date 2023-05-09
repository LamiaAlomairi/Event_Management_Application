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
@Table(name = "attendee")
public class Attendee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    Integer phone;
    String address;

    @ManyToMany(mappedBy = "attendees")
    @JsonIgnore
    private List<Event> events;
}
