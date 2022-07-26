package com.garnerju.trainreservation.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "route_id")
    private int id;

    @Column(name = "route_name")
    private String name;

    @Column(name = "train_id")
    private int train_id;

    @Column(name = "source_station_id")
    private int sourceStationId;

    @Column(name = "destination_station_id")
    private int destinationStationId;

    public Route(int id, String name, int train_id, int sourceStationId, int destinationStationId) {
        this.id = id;
        this.name = name;
        this.train_id = train_id;
        this.sourceStationId = sourceStationId;
        this.destinationStationId = destinationStationId;
    }

    public Route(String name, int train_id, int sourceStationId, int destinationStationId) {
        this.name = name;
        this.train_id = train_id;
        this.sourceStationId = sourceStationId;
        this.destinationStationId = destinationStationId;
    }

    public Route(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrain_id() {
        return train_id;
    }

    public void setTrain_id(int train_id) {
        this.train_id = train_id;
    }

    public int getSourceStationId() {
        return sourceStationId;
    }

    public void setSourceStationId(int sourceStationId) {
        this.sourceStationId = sourceStationId;
    }

    public int getDestinationStationId() {
        return destinationStationId;
    }

    public void setDestinationStationId(int destinationStationId) {
        this.destinationStationId = destinationStationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return id == route.id && train_id == route.train_id && sourceStationId == route.sourceStationId && destinationStationId == route.destinationStationId && Objects.equals(name, route.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, train_id, sourceStationId, destinationStationId);
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", train_id=" + train_id +
                ", sourceStationId=" + sourceStationId +
                ", destinationStationId=" + destinationStationId +
                '}';
    }
}
