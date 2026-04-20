package com.parking.model;

public class Vehicle {
    private int vehicleId;
    private String number;

    public Vehicle(int vehicleId, String number) {
        this.vehicleId = vehicleId;
        this.number = number;
    }

    public void exitParking() {
        System.out.println("Vehicle Exited: " + number);
    }
}