package com.parking.parking.persistence.impl;

import com.parking.parking.domain.repository.ParkingRepository;
import com.parking.parking.persistence.crud.ParkingCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ParkingRepositoryImpl implements ParkingRepository {
    private ParkingCrudRepository parkingCrudRepository;
}
