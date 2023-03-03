package com.charging.station.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charging.station.entities.Station;

public interface StationRepository extends JpaRepository<Station,Integer>{

}
