package main.java.com.parking.model;

public class Payment {

    public boolean makePayment(int amount) {
        if (amount > 0) {
            System.out.println("Payment Done: " + amount);
            return true;
        } else {
            System.out.println("Invalid Payment");
            return false;
        }
    }
}