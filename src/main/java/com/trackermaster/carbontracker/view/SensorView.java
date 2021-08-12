package com.trackermaster.carbontracker.view;

import java.util.Set;

public class SensorView {

	private Long id;

	private String name;

	private DistrictView district;
	
	private Set<SensorDataView> sensorDatas;
	
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

	public DistrictView getDistrict() {
		return district;
	}

	public void setDistrict(DistrictView district) {
		this.district = district;
	}

	public Set<SensorDataView> getSensorDatas() {
		return sensorDatas;
	}

	public void setSensorDatas(Set<SensorDataView> sensorDatas) {
		this.sensorDatas = sensorDatas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sensor [id=").append(id).append(", name=").append(name).append("]");
		return builder.toString();
	}

}
