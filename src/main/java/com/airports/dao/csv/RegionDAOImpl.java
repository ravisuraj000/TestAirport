package com.airports.dao.csv;

import com.airports.dao.IRegionDAO;
import com.airports.db.AirportsInMemoryDB;
import com.airports.domain.Region;
import com.airports.exceptions.ObjectNotFoundException;

import java.nio.file.ProviderNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

public class RegionDAOImpl implements IRegionDAO {

    @Override
    public List<Region> findAll() {
        return AirportsInMemoryDB.regions();
    }

    public Region findById(Long id) {
        return AirportsInMemoryDB.regions().stream().filter(r -> r.getId().equals(id)).findFirst().orElseThrow(ObjectNotFoundException::new);
    }

    @Override
    public Region findByCode(String code) {
        return AirportsInMemoryDB.regions().stream().filter(r -> r.getCode().equals(code)).findFirst().orElseThrow(ProviderNotFoundException::new);
    }

    @Override
    public List<Region> findByContinent(String continent) {
        return AirportsInMemoryDB.regions().stream().filter(r -> r.getContinent().equals(continent)).collect(Collectors.toList());
    }

    @Override
    public List<Region> findByName(String name) {
        return AirportsInMemoryDB.regions().stream().filter(r -> r.getName().contains(name)).collect(Collectors.toList());
    }
}
