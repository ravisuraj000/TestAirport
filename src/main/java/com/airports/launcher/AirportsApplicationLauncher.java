package com.airports.launcher;

import com.airports.db.AirportsInMemoryDB;
import com.airports.helpers.AirportType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AirportsApplicationLauncher {
    private static final Logger logger = LoggerFactory.getLogger(AirportsApplicationLauncher.class);

    public static void main(String[] args) {
        // logger.info("Starting Application Airports ");
        AirportsInMemoryDB.airports();
        if (logger.isInfoEnabled())
            logger.info(AirportType.SMALL_AIRPORT.smallAirport());
    }
}
