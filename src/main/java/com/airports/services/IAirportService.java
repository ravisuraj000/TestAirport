package com.airports.services;

import com.airports.domain.Airport;
import com.airports.domain.NavAid;
import com.airports.domain.Region;

import java.util.List;

/**
 * business cases which i really going to expose as the Edge API -->
 */
public interface IAirportService {
    List<Airport> listAllAirports();

    List<Airport> findAirportsByName(String name);

    List<Airport> findAirportsByCountry(String country);

    List<Airport> findAirportsByRunways();

    List<Airport> listAllHeliports();

    List<Airport> listAirportsByContinent(String continent);

    List<Region> listAllRegions();

    List<NavAid> listAllNavaids();

    Airport getRandomAirport();

    void listAllCountries();

    List<String> listAllContinents();

    void login();

    void signup();

    void help();

    List<Airport> airportsSorted(String key);

    void listAirportsPaginated();
}
