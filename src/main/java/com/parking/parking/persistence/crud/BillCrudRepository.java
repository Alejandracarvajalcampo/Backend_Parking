package com.parking.parking.persistence.crud;

import com.parking.parking.persistence.entity.BillEntity;
import org.springframework.data.repository.CrudRepository;

public interface BillCrudRepository extends CrudRepository<BillEntity,Integer> {
}
