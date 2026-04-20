package main.java.com.parking.controller;

import org.springframework.web.bind.annotation.*;
import com.parking.service.ParkingService;

@RestController
public class ParkingController {

    ParkingService service = new ParkingService();

    @GetMapping("/enter")
    public String enterVehicle(@RequestParam String number) {
        return service.enter(number);
    }

    @GetMapping("/exit")
    public String exitVehicle() {
        return service.exit();
    }
}