package com.airports.dao;

import com.airports.domain.Region;

import java.util.List;

public interface IRegionDAO extends IDAO<Region> {
    Region findByCode(String code);
    List<Region> findByContinent(String continent);
    List<Region> findByName(String name);
}
