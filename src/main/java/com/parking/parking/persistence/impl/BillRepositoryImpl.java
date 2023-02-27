package com.parking.parking.persistence.impl;

import com.parking.parking.domain.repository.BillRepository;
import com.parking.parking.persistence.crud.BillCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class BillRepositoryImpl implements BillRepository {  //esta clase se encarga de interactuar con la base de datos
    private BillCrudRepository billCrudRepository;
}
