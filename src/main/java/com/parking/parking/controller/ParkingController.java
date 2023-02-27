package com.parking.parking.controller;

import com.parking.parking.domain.service.ParkingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/parking")
public class ParkingController {
    private ParkingService parkingService;
}
