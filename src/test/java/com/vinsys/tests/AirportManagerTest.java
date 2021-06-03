package com.vinsys.tests;

import com.airports.dao.IAirportsDAO;
import com.airports.dao.ICountriesDAO;
import com.airports.dao.INavAidsDAO;
import com.airports.dao.IRegionDAO;
import com.airports.domain.Airport;
import com.airports.services.IAirportService;
import com.airports.services.impl.AirportServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class AirportManagerTest {
    IAirportService service = null;
    IAirportsDAO airportsDAO = null;
    IRegionDAO regionDAO = null;
    ICountriesDAO countriesDAO = null;
    INavAidsDAO navAidsDAO = null;

    @Before
    public void init() {
        airportsDAO = Mockito.mock(IAirportsDAO.class);
        regionDAO = Mockito.mock(IRegionDAO.class);
        countriesDAO = Mockito.mock(ICountriesDAO.class);
        navAidsDAO= Mockito.mock(INavAidsDAO.class);
        service = new AirportServiceImpl(airportsDAO,regionDAO,navAidsDAO,countriesDAO);
        List<Airport> airports = Collections.emptyList();
        airports.add(new Airport());
    }

    @After
    public void destroy() {
    }
    @Test
    public void testListAllAirports() {
        assertFalse(service.listAllAirports().isEmpty());
    }

    @Test
    public void testFindAirportsByName() {
        fail("Not Yet Impemented");
    }

    @Test
    public void testFindAirportsByCountry() {
        fail("Not Yet Impemented");
    }

    @Test
    public void testFindAirportsBySize() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testFindAirportsByRunways() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testFindHelipads() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testFindAirportsByContinent() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testListAllRegions() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testListAllNavaids() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testGetRandomAirport() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testListCountries() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testListContinents() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testLogin() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testSignup() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testHelp() {
        fail("Not Yet Implemented");
    }

    @Test
    public void listAirportsSorted() {
        fail("Not Yet Implemented");
    }

    @Test
    public void listAirportsPaginated() {
        fail("Not Yet Implemented");
    }


}

