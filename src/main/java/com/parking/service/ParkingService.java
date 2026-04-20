package main.java.com.parking.service;

import com.parking.model.Vehicle;
import com.parking.model.ParkingSlot;
import com.parking.model.Ticket;
import com.parking.model.Payment;
import com.parking.model.ParkingSystem;

public class ParkingService {

    private ParkingSystem system = new ParkingSystem();
    private ParkingSlot slot = new ParkingSlot(101);
    private Vehicle vehicle;

    public String enter(String number) {

        vehicle = new Vehicle(1, number);

        if (system.checkAvailability(slot)) {
            system.assignSlot(slot);
            return "Vehicle " + number + " parked in Slot " + slot.getSlotId();
        } else {
            return "Parking Full!";
        }
    }

    public String exit() {

        if (vehicle == null) {
            return "No vehicle to exit!";
        }

        Ticket ticket = system.generateTicket();
        int fee = ticket.calculateFee();

        system.processPayment(fee);
        vehicle.exitParking();
        slot.freeSlot();

        return "🚪 Vehicle exited. Fee Paid: ₹" + fee;
    }
}