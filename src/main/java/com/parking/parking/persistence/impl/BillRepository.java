package com.parking.parking.persistence.impl;

import com.parking.parking.persistence.crud.BillCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class BillRepository {  //esta clase se encarga de interactuar con la base de datos
    private BillCrudRepository billCrudRepository;
}
