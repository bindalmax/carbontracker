package com.trackermaster.carbontracker.service;

import com.trackermaster.carbontracker.view.CityView;
import com.trackermaster.carbontracker.view.SensorDataView;

public interface SensorDataService {

	public CityView getSensorData(String cityName);
	
	public void addSensorData(SensorDataView dataView);
}
