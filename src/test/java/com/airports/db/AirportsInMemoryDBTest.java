package com.airports.db;

import com.airports.domain.Airport;
import com.airports.domain.Region;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class AirportsInMemoryDBTest {

    @Test
    public void airports() {
        assertNotNull(AirportsInMemoryDB.airports());
    }

    @Test
    public void navaids() {
        assertNotNull(AirportsInMemoryDB.navaids());
    }

    @Test
    public void countries() {
        assertNotNull(AirportsInMemoryDB.countries());
    }

    @Test
    public void regions() {



       // Mockito.when(AirportsInMemoryDB.regions()).thenReturn(regionList);
        assertNotNull(AirportsInMemoryDB.regions());
    }
}