package com.trackermaster.carbontracker.dao;

import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Long> {

	City findByName(String cityName);
}
