package com.airports.dao.csv;

import com.airports.dao.ICountriesDAO;
import com.airports.db.AirportsInMemoryDB;
import com.airports.domain.Country;
import com.airports.exceptions.ObjectNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ravi
 */
public class CountriesDAOImpl implements ICountriesDAO {

    /**
     * @return List
     */
    @Override
    public List<Country> findAll() {
        return AirportsInMemoryDB.countries();
    }

    /**
     * @param id
     * @return Country
     */
    public Country findById(Long id) {
        return AirportsInMemoryDB.countries().stream().filter(c -> c.getId().equals(id)).findFirst().orElseThrow(ObjectNotFoundException::new);
    }

    /**
     * @param name
     * @return List
     */
    @Override
    public List<Country> findByName(String name) {
        return AirportsInMemoryDB.countries().stream().filter(c -> c.getName().contains(name)).collect(Collectors.toList());
    }


    /**
     * @param continent
     * @return List
     */
    @Override
    public List<Country> findByContinent(String continent) {
        return AirportsInMemoryDB.countries().stream().filter(c -> c.getContinent().contains(continent)).collect(Collectors.toList());
    }

    @Override
    public Country findByCode(String code) {
        return AirportsInMemoryDB.countries().stream().filter(r -> r.getCode().equals(code)).findFirst().orElseThrow(ObjectNotFoundException::new);
    }

}
