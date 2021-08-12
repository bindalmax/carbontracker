package com.trackermaster.carbontracker.mapper;

import java.util.HashSet;
import java.util.Set;

import org.springframework.util.CollectionUtils;

import com.trackermaster.carbontracker.dao.Sensor;
import com.trackermaster.carbontracker.view.SensorView;

public class SensorMapper {

	public static SensorView toView(Sensor source) {
		SensorView target = new SensorView();
		target.setId(source.getId());
		target.setName(source.getName());
		target.setSensorDatas(SensorDataMapper.toViews(source.getSensorDatas()));
		return target;
	}

	public static Set<SensorView> toViews(Set<Sensor> sources) {

		Set<SensorView> targets = null;
		if (!CollectionUtils.isEmpty(sources)) {
			targets = new HashSet<>();
			for (Sensor s : sources) {
				targets.add(toView(s));
			}
		}
		return targets;
	}
}
