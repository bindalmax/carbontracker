package com.trackermaster.carbontracker.view;

import java.util.Set;

public class DistrictView {

	private Long id;

	private String name;

	private CityView city;
	
	private Set<SensorView> sensors;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CityView getCity() {
		return city;
	}

	public void setCity(CityView city) {
		this.city = city;
	}

	public Set<SensorView> getSensors() {
		return sensors;
	}

	public void setSensors(Set<SensorView> sensors) {
		this.sensors = sensors;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("District [id=").append(id).append(", name=").append(name).append("]");
		return builder.toString();
	}

}
