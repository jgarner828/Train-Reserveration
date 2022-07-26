package com.garnerju.trainreservation.repository;

import com.garnerju.trainreservation.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {
}
