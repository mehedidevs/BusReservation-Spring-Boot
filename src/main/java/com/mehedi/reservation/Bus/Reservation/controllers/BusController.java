package com.mehedi.reservation.Bus.Reservation.controllers;

import com.mehedi.reservation.Bus.Reservation.entities.Bus;
import com.mehedi.reservation.Bus.Reservation.models.ResponseModel;
import com.mehedi.reservation.Bus.Reservation.services.impl.BusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @GetMapping("/buses")
    public ResponseModel<List<Bus>> getAllBus() {

        //return ResponseEntity.ok(busService.getAllBus());

        return new ResponseModel<List<Bus>>(HttpStatus.OK.value(), "success", busService.getAllBus());
    }


}
