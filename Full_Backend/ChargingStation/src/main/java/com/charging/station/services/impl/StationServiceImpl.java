package com.charging.station.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.charging.station.entities.Station;
import com.charging.station.repositories.StationRepository;
import com.charging.station.services.StationService;

@Service
public class StationServiceImpl implements StationService{

	@Autowired
	StationRepository stationRepository;
	
	
	@Override
	public List<Station> getStations() {
		return this.stationRepository.findAll();
	}

	@Override
	public Optional<Station> getStation(String id) {
		int station_id = Integer.parseInt(id);
		return this.stationRepository.findById(station_id);
	}

	@Override
	public Station addStation(Station station) {
		return this.stationRepository.save(station);
	}

	@Override
	public Station updateStation(String station_id,Station station) {
		Station station1 = this.stationRepository.getById(Integer.parseInt(station_id));
		station1.setStation_address(station.getStation_address());
		station1.setStation_image(station.getStation_image());
		station1.setStation_name(station.getStation_name());
		station1.setStation_pricing(station.getStation_pricing());
		return this.stationRepository.save(station1);
	}

	@Override
	public void deleteStation(String id) {
		this.stationRepository.deleteById(Integer.parseInt(id));
	}

}
