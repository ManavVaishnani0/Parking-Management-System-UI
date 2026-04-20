package com.parking.model;

public class Ticket {
    private int ticketId;
    private int duration;

    public Ticket(int ticketId, int duration) {
        this.ticketId = ticketId;
        this.duration = duration;
    }

    public int calculateFee() {
        return duration * 10;
    }
}