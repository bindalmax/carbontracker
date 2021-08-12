package com.trackermaster.carbontracker.mapper;

import java.util.HashSet;
import java.util.Set;

import org.springframework.util.CollectionUtils;

import com.trackermaster.carbontracker.dao.District;
import com.trackermaster.carbontracker.view.DistrictView;

public class DistrictMapper {

	public static DistrictView toView(District d) {

		DistrictView t = new DistrictView();
		t.setId(d.getId());
		t.setName(d.getName());
		t.setSensors(SensorMapper.toViews(d.getSensors()));
		return t;
	}

	public static Set<DistrictView> toViews(Set<District> sources) {

		Set<DistrictView> targets = null;
		if (!CollectionUtils.isEmpty(sources)) {
			targets = new HashSet<>();
			for (District d : sources) {
				targets.add(toView(d));
			}
		}
		return targets;
	}
}
