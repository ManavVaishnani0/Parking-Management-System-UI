package com.parking.controller;

import org.springframework.web.bind.annotation.*;
import com.parking.service.ParkingService;

@RestController
@CrossOrigin
public class ParkingController {

    private final ParkingService service;

    public ParkingController(ParkingService service) {
        this.service = service;
    }

    @GetMapping("/enter")
    public String enterVehicle(@RequestParam String number) {
        System.out.println("Enter endpoint called"); // optional
        return service.enter(number);
    }

    @GetMapping("/exit")
    public String exitVehicle() {
        System.out.println("Exit endpoint called"); // 👈 IMPORTANT
        return service.exit();
    }
}