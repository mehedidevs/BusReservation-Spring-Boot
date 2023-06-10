package com.mehedi.reservation.Bus.Reservation.services;

import com.mehedi.reservation.Bus.Reservation.entities.BusRoute;

import java.util.List;

public interface BusRouteService {


    BusRoute addRoute(BusRoute busRoute);

    List<BusRoute> getAllBus();


    BusRoute getRouteByName(String routeName);


    BusRoute getRouteByCityFromToCityTo(String cityFrom, String cityTo);


}
