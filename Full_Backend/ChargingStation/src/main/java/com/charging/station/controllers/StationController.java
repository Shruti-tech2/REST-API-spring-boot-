package com.charging.station.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.charging.station.entities.Station;
import com.charging.station.services.StationService;

@RestController
public class StationController {
	
	@Autowired
	private StationService stationSrvice;
	
	@GetMapping()
	public List<Station> getStations()
	{
		return this.stationSrvice.getStations();
	}
	
	@GetMapping("/show/{station_id}")
	public Optional<Station> getStation(@PathVariable String station_id)
	{
		return this.stationSrvice.getStation(station_id);
	}
	
	@PostMapping()
	public Station addStation(@RequestBody Station station)
	{
		return this.stationSrvice.addStation(station);
	}
	
	@PutMapping("/{station_id}/edit")
	public Station updateStation(@PathVariable String station_id, @RequestBody Station station)
	{
		return this.stationSrvice.updateStation(station_id, station);
	}
	
	@DeleteMapping("/delete/{station_id}")
	public void deleteStation(@PathVariable String station_id)
	{
		this.stationSrvice.deleteStation(station_id);
	}
}
