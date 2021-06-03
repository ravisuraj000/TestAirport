package com.airports.dao;

import com.airports.domain.Country;

import java.util.List;

public interface ICountriesDAO extends IDAO<Country> {

    List<Country> findByName(String name);

    List<Country> findByContinent(String name);

    Country findByCode(String code);
}
