package com.Event_Management_Application.Event_Management_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String type_VIP_general;
    Double price;
    Integer quantity;
    String sale_start_date;
    String sale_end_date;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    Event event;
}
