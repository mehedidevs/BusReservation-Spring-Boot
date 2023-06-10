package com.mehedi.reservation.Bus.Reservation.controllers;

import com.mehedi.reservation.Bus.Reservation.entities.BusRoute;
import com.mehedi.reservation.Bus.Reservation.models.ResponseModel;
import com.mehedi.reservation.Bus.Reservation.services.impl.BusRouteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/route")
public class BusRouteController {

    @Autowired
    private BusRouteServiceImpl busRouteService;


    @PostMapping("/add")
    public ResponseModel<BusRoute> addBusRoute(@RequestBody BusRoute busRoute) {

        return new ResponseModel<>(HttpStatus.OK.value(), "Route Saved", busRouteService.addRoute(busRoute));
    }

    @GetMapping("/all")
    public ResponseModel<List<BusRoute>> getAllRoute() {
        return new ResponseModel<>(HttpStatus.OK.value(), "success", busRouteService.getAllBus());
    }

    @GetMapping("/{route-name}")
    public ResponseModel<BusRoute> getRouteBYRouteName(@PathVariable(name = "route-name") String routeName) {

        return new ResponseModel<>(HttpStatus.OK.value(), "success", busRouteService.getRouteByName(routeName));


    }


    @GetMapping("/query")
    public ResponseModel<BusRoute> getRouteByCityFromAndCityTo(@RequestParam String cityFrom, @RequestParam String cityTo) {

        return new ResponseModel<>(HttpStatus.OK.value(), "Success", busRouteService.getRouteByCityFromToCityTo(cityFrom, cityTo));

    }


}
