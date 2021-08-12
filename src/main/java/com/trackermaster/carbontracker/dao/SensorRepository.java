package com.trackermaster.carbontracker.dao;

import org.springframework.data.repository.CrudRepository;

public interface SensorRepository extends CrudRepository<Sensor, Long> {

	Sensor findByName(String name);
}
