package com.mehedi.reservation.Bus.Reservation.services.impl;

import com.mehedi.reservation.Bus.Reservation.entities.Bus;
import com.mehedi.reservation.Bus.Reservation.reos.BusRepository;
import com.mehedi.reservation.Bus.Reservation.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusServiceImpl implements BusService {

    @Autowired
    BusRepository busRepository;


    @Override
    public Bus adaBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public List<Bus> getAllBus() {
        return busRepository.findAll();
    }
}
