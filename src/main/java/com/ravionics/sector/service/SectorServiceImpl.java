package com.ravionics.sector.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravionics.sector.entity.Sector;
import com.ravionics.sector.repository.SectorRepository;

@Service
public class SectorServiceImpl implements SectorService {

	@Autowired
	private SectorRepository sectorRepository;

	@Override
	public String createSector(Sector sector) {
		sectorRepository.save(sector);
		int sectorId = sector.getSector_id();
		return "Sector with SectorId " + sectorId + " created!";
	}

	@Override
	public Sector getSector(int sectorId) {
		Optional<Sector> optionalSector = sectorRepository.findById(sectorId);
		if (optionalSector.isPresent()) {
			return optionalSector.get();
		}
		return null;
	}

	@Override
	public List<Sector> getAllSectors() {
		return sectorRepository.findAll();

	}

	@Override
	public Sector updateSector(Sector sector) {
		return sectorRepository.save(sector);

	}

	@Override
	public void deleteSector(int sectorId) {
		sectorRepository.deleteById(sectorId);

	}

}
