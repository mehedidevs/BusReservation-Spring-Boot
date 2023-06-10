package com.mehedi.reservation.Bus.Reservation.services.impl;

import com.mehedi.reservation.Bus.Reservation.entities.Bus;
import com.mehedi.reservation.Bus.Reservation.entities.BusRoute;
import com.mehedi.reservation.Bus.Reservation.reos.BusRepository;
import com.mehedi.reservation.Bus.Reservation.reos.BusRouteRepository;
import com.mehedi.reservation.Bus.Reservation.services.BusRouteService;
import com.mehedi.reservation.Bus.Reservation.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusRouteServiceImpl implements BusRouteService {


    @Autowired
    private BusRouteRepository busRouteRepository;

    @Override
    public BusRoute addRoute(BusRoute busRoute) {


        return busRouteRepository.save(busRoute);
    }

    @Override
    public List<BusRoute> getAllBus() {
        return busRouteRepository.findAll();
    }

    @Override
    public BusRoute getRouteByName(String routeName) {
        return busRouteRepository.findByRouteName(routeName).orElseThrow();
    }

    @Override
    public BusRoute getRouteByCityFromToCityTo(String cityFrom, String cityTo) {
        return busRouteRepository.findByCityFromAndCityTo(cityFrom, cityTo).orElseThrow();
    }
}

