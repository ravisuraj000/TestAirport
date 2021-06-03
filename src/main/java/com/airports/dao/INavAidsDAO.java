package com.airports.dao;

import com.airports.domain.NavAid;

import java.util.List;


public interface INavAidsDAO extends IDAO<NavAid> {


    List<NavAid> findByName(String name);
}
