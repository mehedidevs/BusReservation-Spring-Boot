package com.mehedi.reservation.Bus.Reservation.reos;


import com.mehedi.reservation.Bus.Reservation.entities.BusRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BusRouteRepository extends JpaRepository<BusRoute, Long> {

    Optional<BusRoute> findByRouteName(String routeName);

    Optional<BusRoute> findByCityFromAndCityTo(String cityFrom, String cityTo);


}
