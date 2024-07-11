package com.example.SpringBoot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("singleton")
public class TicketNumberGenerator {
    public String  createNewNumber() {
        return "Ticket #" + UUID.randomUUID().toString();
    }
}
