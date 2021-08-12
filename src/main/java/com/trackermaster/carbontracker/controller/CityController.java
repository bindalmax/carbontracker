package com.trackermaster.carbontracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trackermaster.carbontracker.service.SensorDataService;
import com.trackermaster.carbontracker.view.CityView;

@RestController
@RequestMapping("/cities")
public class CityController {

	@Autowired
	SensorDataService sensorDataService;

	@GetMapping("/{cityName}/getAllSensorsData")
	public CityView getSensorData(@PathVariable String cityName) {
		return sensorDataService.getSensorData(cityName);
	}
}
