package com.garnerju.trainreservation.controller;

import com.garnerju.trainreservation.model.RouteStation;
import com.garnerju.trainreservation.service.RouteStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RouteStationController {

    @Autowired
    RouteStationService routeStationService;

    @GetMapping("/routestations")
    public List<RouteStation> getAllRouteStation() {
        return routeStationService.getAllRouteStation();
    }

    @GetMapping("/routestations/{id}")
    public RouteStation getRouteStationById(@PathVariable int id) {
        return routeStationService.getRouteStationById(id);
    }

    @PostMapping("/routestations")
    public RouteStation addNewRouteStation(@RequestBody RouteStation newRouteStation) {
        return routeStationService.createRouteStation(newRouteStation);
    }

    @PutMapping("/routestations")
    public void updateRouteStation(@RequestBody RouteStation routeStation) {
        routeStationService.updateRouteStation(routeStation);
    }

    @DeleteMapping("/routestations/{id}")
    public void deleteRouteStation(@PathVariable int id) {
        routeStationService.deleteRouteStation(id);

    }

}
