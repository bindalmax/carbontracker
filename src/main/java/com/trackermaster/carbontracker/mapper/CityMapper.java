package com.trackermaster.carbontracker.mapper;

import com.trackermaster.carbontracker.dao.City;
import com.trackermaster.carbontracker.view.CityView;

public class CityMapper {

	public static CityView toView(City source) {

		CityView target = new CityView();
		target.setId(source.getId());
		target.setName(source.getName());
		target.setDistricts(DistrictMapper.toViews(source.getDistricts()));
		return target;
	}
}
