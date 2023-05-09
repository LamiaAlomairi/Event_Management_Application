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
@Table(name = "sponsor")
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String logo;
    String website;

    @ManyToMany(mappedBy = "sponsors")
    @JsonIgnore
    private List<Event> events;
}
