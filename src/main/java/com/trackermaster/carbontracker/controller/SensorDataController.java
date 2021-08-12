package com.trackermaster.carbontracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.trackermaster.carbontracker.service.SensorDataService;
import com.trackermaster.carbontracker.view.SensorDataView;

@RestController
@RequestMapping("/sensors")
public class SensorDataController {

	@Autowired
	SensorDataService sensorDataService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Void> saveSensorData(@RequestBody SensorDataView dataView) {
		sensorDataService.addSensorData(dataView);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
