package com.parking.parking.persistence.mapper;

import com.parking.parking.domain.Bill;
import com.parking.parking.persistence.entity.BillEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface BillMapper {
    @Mappings({
            @Mapping(source = "id",target = "billId"),
            @Mapping(source = "amountToBePaid",target = "pay"),

    })
    Bill toBill(BillEntity billEntity);

    @InheritInverseConfiguration
    @Mapping(target = "parkingEntry", ignore = true)
    BillEntity toBillEntity(Bill bill);
}
