package com.trackermaster.carbontracker.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trackermaster.carbontracker.dao.City;
import com.trackermaster.carbontracker.dao.CityRepository;
import com.trackermaster.carbontracker.dao.Sensor;
import com.trackermaster.carbontracker.dao.SensorData;
import com.trackermaster.carbontracker.dao.SensorDataRepository;
import com.trackermaster.carbontracker.dao.SensorRepository;
import com.trackermaster.carbontracker.mapper.CityMapper;
import com.trackermaster.carbontracker.view.CityView;
import com.trackermaster.carbontracker.view.SensorDataView;

@Service
public class SensorDataServiceImpl implements SensorDataService {

	@Autowired
	CityRepository cityRepository;

	@Autowired
	SensorDataRepository sensorDataRepository;

	@Autowired
	SensorRepository sensorRepository;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public CityView getSensorData(String cityName) {
		City city = cityRepository.findByName(cityName);
		CityView cityData = CityMapper.toView(city);
		return cityData;
	}

	@Override
	public void addSensorData(SensorDataView dataView) {
		SensorData sensorData = modelMapper.map(dataView, SensorData.class);
		Sensor sensor = sensorRepository.findByName(sensorData.getSensor().getName());
		sensorData.setSensor(sensor);
		sensorDataRepository.save(sensorData);
	}

}
