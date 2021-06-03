package com.airports.helpers;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirportTypeTest {

    @Test
    public void testSmallAirport() {

        assertEquals("small_airport", AirportType.SMALL_AIRPORT.smallAirport() );
    }

    @Test
    public void testLargeAirport() {
        assertEquals("large_airport", AirportType.LARGE_AIRPORT.largeAirport() );
    }

    @Test
    public void testMediumAirport() {
        assertEquals("medium_airport", AirportType.MEDIUM_AIRPORT.mediumAirport());
    }

    @Test
    public void testBaloonPort() {
        assertEquals("balloonport", AirportType.BALLOONPORT.balloonport() );
    }

    @Test
    public void testClosed() {
        assertEquals("closed", AirportType.CLOSED.closed() );
    }

    @Test
    public void testHeliport() {
        assertEquals( "heliport", AirportType.HELIPORT.heliport());
    }

    @Test
    public void testSeaplaneBase() {
        assertEquals("seaplane_base", AirportType.SEAPLANE_BASE.seaplaneBase() );
    }

    @Test
    public void testValues() {
        assertNotNull(AirportType.values());
    }

    @Test
    public void testValueOf() {
        assertEquals(AirportType.SMALL_AIRPORT , AirportType.valueOf(AirportType.SMALL_AIRPORT.name()));
    }
}