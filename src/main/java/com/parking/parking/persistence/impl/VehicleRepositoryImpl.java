package com.parking.parking.persistence.impl;

import com.parking.parking.domain.repository.VehicleRepository;
import com.parking.parking.persistence.crud.VehicleCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class VehicleRepositoryImpl implements VehicleRepository {
    private VehicleCrudRepository vehicleCrudRepository;
}
