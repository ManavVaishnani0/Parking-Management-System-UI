package com.parking.service;

import org.springframework.stereotype.Service;
import com.parking.model.*;

@Service
public class ParkingService {

    private final ParkingSystem system = new ParkingSystem();
    private final ParkingSlot slot = new ParkingSlot(101);
    private Vehicle vehicle = null;

    public String enter(String number) {
        if (number == null || number.trim().isEmpty()) {
            return "❌ Enter vehicle number!";
        }

        if (!system.checkAvailability(slot)) {
            return "❌ Parking Full!";
        }

        vehicle = new Vehicle(1, number);
        system.assignSlot(slot);
        return "✅ Vehicle " + number + " parked in Slot " + slot.getSlotId();
    }

    public String exit() {
        if (vehicle == null) {
            return "❌ No vehicle to exit!";
        }

        Ticket ticket = system.generateTicket();
        int fee = ticket.calculateFee();

        system.processPayment(fee);
        vehicle.exitParking();
        slot.freeSlot();

        vehicle = null; // reset state
        return "🚪 Vehicle exited. Fee Paid: ₹" + fee;
    }
}