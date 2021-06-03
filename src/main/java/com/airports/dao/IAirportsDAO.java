package com.airports.dao;

import com.airports.domain.Airport;

import java.util.List;


public interface IAirportsDAO extends IDAO<Airport> {
    List<Airport> findByName(String name);
    List<Airport> findByType(String name);
    List<Airport> findByCountry(String country);
}
