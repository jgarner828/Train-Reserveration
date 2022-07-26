package com.garnerju.trainreservation.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "station_id")
    private int id;

    private String name;

    @Column(name = "station_code")
    private String stationCode;

    public Station(int id, String name, String stationCode) {
        this.id = id;
        this.name = name;
        this.stationCode = stationCode;
    }

    public Station(String name, String stationCode) {
        this.name = name;
        this.stationCode = stationCode;
    }

    public Station(){

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

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Station station = (Station) o;
        return id == station.id && Objects.equals(name, station.name) && Objects.equals(stationCode, station.stationCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, stationCode);
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stationCode='" + stationCode + '\'' +
                '}';
    }
}
