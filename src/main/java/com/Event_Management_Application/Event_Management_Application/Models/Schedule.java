package com.Event_Management_Application.Event_Management_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String date;
    String title;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    Event event;
}
