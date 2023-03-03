package com.charging.station.services;

import java.util.List;
import java.util.Optional;

import com.charging.station.entities.Station;

public interface StationService {
	public List<Station> getStations();
	
	public Optional<Station> getStation(String id);
	
	public Station addStation(Station station);
	
	public Station updateStation(String id,Station station);
	
	public void deleteStation(String id);
}
