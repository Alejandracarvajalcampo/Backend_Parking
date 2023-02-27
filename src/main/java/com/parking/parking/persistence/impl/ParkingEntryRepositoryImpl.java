package com.parking.parking.persistence.impl;

import com.parking.parking.domain.repository.ParkingEntryRepository;
import com.parking.parking.persistence.crud.ParkingEntryCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ParkingEntryRepositoryImpl implements ParkingEntryRepository {
    private ParkingEntryCrudRepository parkingEntryCrudRepository;
}
