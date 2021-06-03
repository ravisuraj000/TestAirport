package com.airports.dao.csv;

import com.airports.dao.INavAidsDAO;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NavAidsDAOImplTest {
    INavAidsDAO dao;

    @Before
    public void setup(){
            dao = new NavAidsDAOImpl();
    }


    @Test
    public void findAll() {
        assertFalse(dao.findAll().isEmpty());
    }

    @Test
    public void findById() {
        assertNotNull(dao.findById(85050L));
    }

    @Test
    public void findByName() {
        assertNotNull(dao.findByName("Williams Harbour"));
    }
}