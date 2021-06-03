package com.airports.functions;

import org.junit.Test;
import org.mockito.Mockito;

public class TransformerFunctionsTest {

    @Test(expected = IllegalArgumentException.class)
    public void testStringToAirportBadArg() {
        Mockito.when( TransformerFunctions.stringToAirport(null)).thenThrow(IllegalArgumentException.class);
        TransformerFunctions.stringToAirport(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringToCountryBadArg() {
        Mockito.when(TransformerFunctions.stringToCountry(null)).thenThrow(IllegalArgumentException.class);
        TransformerFunctions.stringToCountry(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringToRegionBadArg() {
        Mockito.when(TransformerFunctions.stringToRegion(null)).thenThrow(IllegalArgumentException.class);
        TransformerFunctions.stringToRegion(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringToNavaidBadArg() {
        Mockito.when(TransformerFunctions.stringToNavaid(null)).thenThrow(IllegalArgumentException.class);
        TransformerFunctions.stringToNavaid(null);
    }
}