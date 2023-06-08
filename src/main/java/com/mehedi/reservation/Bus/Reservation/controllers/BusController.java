package com.mehedi.reservation.Bus.Reservation.controllers;

import com.mehedi.reservation.Bus.Reservation.entities.Bus;
import com.mehedi.reservation.Bus.Reservation.models.ResponseModel;
import com.mehedi.reservation.Bus.Reservation.services.impl.BusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/bus")
public class BusController {

    @Autowired
    BusServiceImpl busService;


    @PostMapping("/add")
    public ResponseModel<Bus> addBus(@RequestBody Bus bus) {
        Bus savedbus = busService.adaBus(bus);

        return new ResponseModel<Bus>(HttpStatus.OK.value(), "Bus saved", savedbus);
    }


}
