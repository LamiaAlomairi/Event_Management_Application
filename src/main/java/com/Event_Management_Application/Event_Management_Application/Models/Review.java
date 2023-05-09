package com.Event_Management_Application.Event_Management_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer rating_out_of_5;
    String comment;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    Event event;
}
