package com.parking.parking.persistence.crud;

import com.parking.parking.persistence.entity.VehicleEntity;
import org.springframework.data.repository.CrudRepository;

public interface VehicleCrudRepository extends CrudRepository<VehicleEntity, Integer> {
}
