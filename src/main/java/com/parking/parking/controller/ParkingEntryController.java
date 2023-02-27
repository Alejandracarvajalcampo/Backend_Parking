package com.parking.parking.controller;

import com.parking.parking.domain.service.ParkingEntryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parkingEntry")
public class ParkingEntryController {
    private ParkingEntryService parkingEntryService;
}
