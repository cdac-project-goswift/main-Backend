package com.goswift.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cities", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"city_name", "state", "country"})
})
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;

    // Feature: Geo-Location for Map Integration
    // Stores coordinates to show cities on a Google Map integration.
    /*
    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;
    */
    @Column(name = "city_name", nullable = false)
    private String cityName;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String country;
}