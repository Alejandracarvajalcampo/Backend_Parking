package com.parking.parking.controller;

import com.parking.parking.domain.service.VehicleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    private VehicleService vehicleService;
}
