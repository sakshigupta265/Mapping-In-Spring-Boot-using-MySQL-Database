package com.ravionics.sector.service;

import java.util.List;

import com.ravionics.sector.entity.Sector;

public interface SectorService {
	public String createSector(Sector sector);

	public Sector updateSector(Sector sector);

	public Sector getSector(int sectorId);

	public void deleteSector(int sectorId);

	public List<Sector> getAllSectors();

}
