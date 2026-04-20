package com.parking.model;

public class ParkingSlot {
    private int slotId;
    private boolean available = true;

    public ParkingSlot(int slotId) {
        this.slotId = slotId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void assignSlot() {
        available = false;
    }

    public void freeSlot() {
        available = true;
    }

    public int getSlotId() {
        return slotId;
    }
}