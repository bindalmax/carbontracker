package com.trackermaster.carbontracker.mapper;

import java.util.HashSet;
import java.util.Set;

import org.springframework.util.CollectionUtils;

import com.trackermaster.carbontracker.dao.Sensor;
import com.trackermaster.carbontracker.dao.SensorData;
import com.trackermaster.carbontracker.view.SensorDataView;
import com.trackermaster.carbontracker.view.SensorView;

public class SensorDataMapper {

	public static SensorDataView toView(SensorData source) {
		SensorDataView target = new SensorDataView();
		target.setId(source.getId());
		target.setCarbonPPM(source.getCarbonPPM());
		target.setEntryTime(source.getEntryTime());
		return target;
	}
	
	public static Set<SensorDataView> toViews(Set<SensorData> sources) {

		Set<SensorDataView> targets = null;
		if (!CollectionUtils.isEmpty(sources)) {
			targets = new HashSet<>();
			for (SensorData s : sources) {
				targets.add(toView(s));
			}
		}
		return targets;
	}
}
