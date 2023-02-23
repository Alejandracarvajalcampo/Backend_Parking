package com.parking.parking.persistence.crud;

import com.parking.parking.persistence.entity.ParkingEntryEntity;
import org.springframework.data.repository.CrudRepository;

public interface ParkingEntryCrudRepository extends CrudRepository<ParkingEntryEntity,Integer> {
}
