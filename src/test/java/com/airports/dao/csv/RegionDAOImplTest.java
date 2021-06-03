package com.airports.dao.csv;

import com.airports.dao.IRegionDAO;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegionDAOImplTest {
    IRegionDAO dao;

    @Before
    public void setup() {

        dao = new RegionDAOImpl();
    }

    @Test
    public void TestFindAll() {


        assertFalse(dao.findAll().isEmpty());
    }

    @Test
    public void testFindById() {
        assertNotNull(dao.findById(302811L));
    }

    @Test
    public void testFindByCode() {
        assertNotNull(dao.findByCode("AD-02"));
    }

    @Test
    public void testFindByContinent() {
        assertFalse(dao.findByContinent("EU").isEmpty());
    }

    @Test
    public void testFindByName() {
        assertNotNull(dao.findByName("Canillo"));
    }
}