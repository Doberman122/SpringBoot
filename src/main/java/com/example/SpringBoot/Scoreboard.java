package com.example.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Scoreboard {

    @Autowired
    TicketNumberGenerator ticketNumberGenerator;

    public void newTicket() {
        Ticket ticket = new Ticket();
        ticket.setNumber(ticketNumberGenerator.createNewNumber());
        ticket.setCreatedAt(LocalDateTime.now());
    }

    @Override
    public String toString() {
        return "Scoreboard{" +
                "ticketNumberGenerator=" + ticketNumberGenerator +
                '}';
    }
}
