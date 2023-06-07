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
    String typeVIPGeneral;
    Double price;
    Integer quantity;
    String saleStartDate;
    String saleEndDate;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    Event event;
}
