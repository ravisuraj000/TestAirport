package com.airports.dao.csv;

import com.airports.dao.IAirportsDAO;
import com.airports.domain.Airport;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AirportsDAOImplTest {
    IAirportsDAO dao = null;
    List<Airport> airports=null;
    @Before
    public void setup() {
        dao = new AirportsDAOImpl();
        Airport airport=new Airport();
        airports=new ArrayList<>();
        airport.setName("Siachen Glacier AFS Airport");
        airport.setType("heliport");
        airport.setLongitude(77);
        airport.setLatitude(35.5);
        airport.setCountryName("INDIA");
        airport.setRegionName("IN-JK");
        airports.add(airport);

        Airport airport1=new Airport();
        airport1.setName("Honiara International Airport");
        airport1.setType("large_airport");
        airport1.setLongitude(12698);
        airport1.setLatitude(-9.428);
        airport1.setCountryName("SB");
        airport1.setRegionName("SB-CT");
        airports.add(airport1);


        dao = Mockito.mock(IAirportsDAO.class);
       // Mockito.when(dao.findByName()).thenReturn(a)

    }

    @Test
    public void testFindByName() {
        Mockito.when(dao.findByName("INDIA")).thenReturn(airports);
        assertNotNull(dao.findByName("INDIA"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindByNameBadArg() {
        Mockito.when(dao.findByName(null)).thenThrow(IllegalArgumentException.class);
        dao.findByName(null);
    }

    @Test
    public void testFindByType() {
        Mockito.when(dao.findByType("large_airport")).thenReturn(airports);
        assertNotNull(dao.findByType("large_airport"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindByTypeBadArg() {
        Mockito.when(dao.findByType(null)).thenThrow(IllegalArgumentException.class);
        dao.findByType(null);
    }

    @Test
    public void testFindByCountry() {
        Mockito.when(dao.findByCountry("SB")).thenReturn(airports);
        assertNotNull(dao.findByCountry("SB"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindByCountryBadArg() {
        Mockito.when(dao.findByCountry(null)).thenThrow(IllegalArgumentException.class);
        dao.findByCountry(null);
    }

    @Test
    public void testFindAll() {
        assertFalse(dao.findAll().isEmpty());
    }

    @Test
    public void testFindById() {
        Long expectedId = 2434L;
        Airport airport = dao.findById(2434L);
        assertEquals(expectedId, airport.getId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindByIdBadArgs() {
        Mockito.when(dao.findById(null)).thenThrow(IllegalArgumentException.class);
        Airport airport = dao.findById(null);
    }

}