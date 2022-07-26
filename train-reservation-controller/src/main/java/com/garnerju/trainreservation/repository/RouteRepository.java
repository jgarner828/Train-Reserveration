package com.garnerju.trainreservation.repository;

import com.garnerju.trainreservation.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {

}
