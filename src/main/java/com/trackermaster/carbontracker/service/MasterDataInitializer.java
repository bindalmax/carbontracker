package com.trackermaster.carbontracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trackermaster.carbontracker.dao.City;
import com.trackermaster.carbontracker.dao.CityRepository;
import com.trackermaster.carbontracker.dao.District;
import com.trackermaster.carbontracker.dao.DistrictRepository;
import com.trackermaster.carbontracker.dao.Sensor;
import com.trackermaster.carbontracker.dao.SensorDataRepository;
import com.trackermaster.carbontracker.dao.SensorRepository;

@Service 
public class MasterDataInitializer {


	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	SensorRepository sensorRepository;
	
	@Autowired 
	SensorDataRepository sensorDataRepository;
	
	@Autowired
	DistrictRepository districtRepository;
	
	public void initializeMasterData() {
		City city = new City();
		city.setName("Barcelona");
		City barcelona = cityRepository.save(city);
	
		
		District district = new District();
		district.setName("Gràcia");
		district.setCity(barcelona);
		District gracia = districtRepository.save(district);
		
		Sensor sensor = new Sensor();
		sensor.setName("Gràcia1");
		sensor.setDistrict(gracia);
		sensorRepository.save(sensor);
		
		Sensor sensor2 = new Sensor();
		sensor2.setName("Gràcia2");
		sensor2.setDistrict(gracia);
		sensorRepository.save(sensor2);
		
		District district2 = new District();
		district2.setName("Eixample");
		district2.setCity(barcelona);
		District eixample = districtRepository.save(district2);
		
		Sensor sensor3 = new Sensor();
		sensor3.setName("Eixample1");
		sensor3.setDistrict(eixample);
		sensorRepository.save(sensor3);
		
		Sensor sensor4 = new Sensor();
		sensor4.setName("Eixample2");
		sensor4.setDistrict(eixample);
		sensorRepository.save(sensor4);
		
		
	}
}
