package com.garnerju.trainreservation.repository;

import com.garnerju.trainreservation.model.RouteStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteStationRepository extends JpaRepository<RouteStation, Integer> {
}
