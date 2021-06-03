package com.airports.dao.csv;

import com.airports.dao.INavAidsDAO;
import com.airports.db.AirportsInMemoryDB;
import com.airports.domain.NavAid;
import com.airports.exceptions.ObjectNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class NavAidsDAOImpl implements INavAidsDAO {

    /**
     *
     * @return
     */
    @Override
    public List<NavAid> findAll() {
        return AirportsInMemoryDB.navaids();
    }

    /**
     *
     * @param id
     * @return NavAid
     */
    public NavAid findById(Long id) {
        return AirportsInMemoryDB.navaids().stream().filter(n -> n.getId().equals(id)).findFirst().orElseThrow(ObjectNotFoundException::new);
    }

    /**
     *
     * @param name
     * @return List
     */
    @Override
    public List<NavAid> findByName(String name) {
        return AirportsInMemoryDB.navaids().stream().filter(n -> n.getName().contains(name)).collect(Collectors.toList());
    }
}
