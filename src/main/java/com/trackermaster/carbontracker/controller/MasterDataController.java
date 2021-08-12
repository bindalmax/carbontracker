package com.trackermaster.carbontracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.trackermaster.carbontracker.service.MasterDataInitializer;

@RestController
@RequestMapping("/masters")
public class MasterDataController {

	@Autowired
	MasterDataInitializer master;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Void> saveTeacher() {
		master.initializeMasterData();
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
