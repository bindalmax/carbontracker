package com.trackermaster.carbontracker.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SensorData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Date entryTime;

	private Float carbonPPM;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sensor_id", nullable = false)
	private Sensor sensor;
	
	protected SensorData() {
		
	}
	
	public SensorData(Date entryTime, Float carbonPPM) {
		super();
		this.entryTime = entryTime;
		this.carbonPPM = carbonPPM;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public Float getCarbonPPM() {
		return carbonPPM;
	}

	public void setCarbonPPM(Float carbonPPM) {
		this.carbonPPM = carbonPPM;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

}
