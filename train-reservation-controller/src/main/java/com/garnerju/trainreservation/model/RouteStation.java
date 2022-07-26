package com.garnerju.trainreservation.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class RouteStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "route_id")
    private int routeId;

    @Column(name = "station_id")
    private int stationId;

    @Column(name = "scheduled_arrival")
    private String scheduledArrival;

    @Column(name = "scheduled_departure")
    private String scheduledDeparture;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RouteStation that = (RouteStation) o;
        return routeId == that.routeId && stationId == that.stationId && Objects.equals(scheduledArrival, that.scheduledArrival) && Objects.equals(scheduledDeparture, that.scheduledDeparture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeId, stationId, scheduledArrival, scheduledDeparture);
    }

    @Override
    public String toString() {
        return "RouteStation{" +
                "routeId=" + routeId +
                ", stationId=" + stationId +
                ", scheduledArrival='" + scheduledArrival + '\'' +
                ", scheduledDeparture='" + scheduledDeparture + '\'' +
                '}';
    }
}
