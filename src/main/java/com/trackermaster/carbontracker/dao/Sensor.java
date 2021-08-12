package com.trackermaster.carbontracker.dao;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Sensor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "district_id", nullable = false)
	private District district;

	@OneToMany(mappedBy = "sensor", fetch = FetchType.LAZY)
	private Set<SensorData> sensorDatas;
	
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

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Set<SensorData> getSensorDatas() {
		return sensorDatas;
	}

	public void setSensorDatas(Set<SensorData> sensorDatas) {
		this.sensorDatas = sensorDatas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sensor [id=").append(id).append(", name=").append(name).append(", district=").append(district)
				.append("]");
		return builder.toString();
	}
	
	
}
