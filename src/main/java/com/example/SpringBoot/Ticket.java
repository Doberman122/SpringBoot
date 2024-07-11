package com.example.SpringBoot;

import java.time.LocalDateTime;

public class Ticket {
    String number;
    LocalDateTime createdAt;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number='" + number + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
