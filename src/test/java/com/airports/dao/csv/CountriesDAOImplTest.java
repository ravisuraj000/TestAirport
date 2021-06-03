package com.airports.dao.csv;

import com.airports.dao.ICountriesDAO;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountriesDAOImplTest {
    ICountriesDAO countriesDAO;

    @Before
    public void setUp() {
        countriesDAO = new CountriesDAOImpl();
    }

    @Test
    public void findAll() {
        assertFalse(countriesDAO.findAll().isEmpty());
    }

    @Test
    public void findById() {
        assertNotNull(countriesDAO.findById(302672L));
    }

    @Test
    public void findByName() {
        assertNotNull(countriesDAO.findByName("India"));
    }

    @Test
    public void findByContinent() {
        assertNotNull(countriesDAO.findByContinent("AS"));
    }

    @Test
    public void findByCode() {
        assertNotNull(countriesDAO.findByCode("AD"));
    }
}