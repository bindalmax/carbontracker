package com.trackermaster.carbontracker.view;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.trackermaster.carbontracker.dao.District;

public class CityView {



	private Long id;

	private String name;

	private Set<DistrictView> districts;

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

	public Set<DistrictView> getDistricts() {
		return districts;
	}

	public void setDistricts(Set<DistrictView> districts) {
		this.districts = districts;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("City [id=").append(id).append(", name=").append(name).append(", districts=").append(districts)
				.append("]");
		return builder.toString();
	}
	

}
