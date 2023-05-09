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
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;
    String date;
    String duration;

    @ManyToOne
    @JoinColumn(name = "venue_id", referencedColumnName = "id")
    Venue venue;

    @ManyToOne
    @JoinColumn(name = "organizer_id", referencedColumnName = "id")
    Organizer organizer;

    @OneToMany(mappedBy = "event")
    @JsonIgnore
    private List<Ticket> tickets;

    @ManyToMany(mappedBy = "event")
    @JoinTable(name = "event_attendees", joinColumns = @JoinColumn(name = "event_id"), inverseJoinColumns = @JoinColumn(name = "attendee_id"))
    private List<Attendee> attendees;

    @OneToMany(mappedBy = "event")
    @JsonIgnore
    private List<Review> reviews;

    @ManyToMany(mappedBy = "event")
    @JoinTable(name = "event_sponsor", joinColumns = @JoinColumn(name = "event_id"), inverseJoinColumns = @JoinColumn(name = "sponsor_id"))
    private List<Sponsor> sponsors;

    @ManyToMany(mappedBy = "event")
    @JoinTable(name = "event_vendor", joinColumns = @JoinColumn(name = "event_id"), inverseJoinColumns = @JoinColumn(name = "vendor_id"))
    private List<Vendor> vendors;

    @OneToMany(mappedBy = "event")
    @JsonIgnore
    private List<Schedule> schedules;
}
