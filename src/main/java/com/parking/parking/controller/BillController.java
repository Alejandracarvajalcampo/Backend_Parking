package com.parking.parking.controller;

import com.parking.parking.domain.service.BillService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/bill") // le indica a los demas como se puede consumir
@RestController // le indica a spring qu eesta clase va a ser el controlador de una apirest
public class BillController {

    private BillService billService; // inyectamos el servicio
}
