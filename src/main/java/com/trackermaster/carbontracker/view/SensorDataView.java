package com.trackermaster.carbontracker.view;

import java.util.Date;

public class SensorDataView {

	private Long id;

	private Date entryTime;

	private Float carbonPPM;

	private SensorView sensor;
	
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

	public SensorView getSensor() {
		return sensor;
	}

	public void setSensor(SensorView sensor) {
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SensorDataView [id=").append(id).append(", entryTime=").append(entryTime).append(", carbonPPM=")
				.append(carbonPPM).append("]");
		return builder.toString();
	}

}
