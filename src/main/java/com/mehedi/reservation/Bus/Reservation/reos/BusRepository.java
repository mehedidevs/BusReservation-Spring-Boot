package com.mehedi.reservation.Bus.Reservation.reos;

import com.mehedi.reservation.Bus.Reservation.entities.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {


}
