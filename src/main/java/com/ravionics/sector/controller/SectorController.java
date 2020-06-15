package com.ravionics.sector.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravionics.sector.entity.Sector;
import com.ravionics.sector.service.SectorService;

@RestController
public class SectorController {
	@Autowired
	private SectorService sectorService;

	@PostMapping(path = "/addSector")
	public ResponseEntity<String> createSector(@RequestBody Sector sector) {
		return new ResponseEntity<>(sectorService.createSector(sector), HttpStatus.CREATED);
	}

	@PutMapping(path = "/updateSector")
	public ResponseEntity<Sector> updateSector(@RequestBody Sector sector) {
		return new ResponseEntity<>(sectorService.updateSector(sector), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/deleteSector/{sectorId}")
	public ResponseEntity<String> deleteSector(@PathVariable(value = "sectorId") int sectorId) {
		sectorService.deleteSector(sectorId);
		return new ResponseEntity<>("Sector with SectorId : " + sectorId + " deleted successfully", HttpStatus.OK);
	}

	@GetMapping(path = "/getSector/{sectorId}")
	public ResponseEntity<Sector> getSector(@PathVariable(value = "sectorId") int sectorId) {
		return new ResponseEntity<>(sectorService.getSector(sectorId), HttpStatus.OK);
	}

	@GetMapping(path = "/getAllSectors")
	public ResponseEntity<List<Sector>> getAllSectors() {
		return new ResponseEntity<>(sectorService.getAllSectors(), HttpStatus.OK);
	}

}