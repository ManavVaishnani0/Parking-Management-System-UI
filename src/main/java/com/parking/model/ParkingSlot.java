package main.java.com.parking.model;

public class ParkingSlot {
    private int slotId;
    private boolean available;

    public ParkingSlot(int slotId) {
        this.slotId = slotId;
        this.available = true;
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