package com.garnerju.trainreservation.service;

import com.garnerju.trainreservation.model.RouteStation;
import com.garnerju.trainreservation.repository.RouteStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RouteStationService {

    @Autowired
    RouteStationRepository repo;

    public List<RouteStation> getAllRouteStation() {
        return repo.findAll();
    }

    public RouteStation createRouteStation(RouteStation newRouteStation) {
        return repo.save(newRouteStation);
    }

    public RouteStation getRouteStationById(int id) {
        Optional<RouteStation> routeStation = repo.findById(id);
        return routeStation.orElse(null);
    }

    public void updateRouteStation(RouteStation routeStation) {
        repo.save(routeStation);
    }


    public void deleteRouteStation(int id) {
        Optional<RouteStation> routeStation = repo.findById(id);
        routeStation.ifPresent(value -> repo.delete(value));
    }
}
