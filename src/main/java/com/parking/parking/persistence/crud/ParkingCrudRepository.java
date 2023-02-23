package com.parking.parking.persistence.crud;

import com.parking.parking.persistence.entity.ParkingEntity;
import org.springframework.data.repository.CrudRepository;

public interface ParkingCrudRepository extends CrudRepository<ParkingEntity,Integer> {
}
