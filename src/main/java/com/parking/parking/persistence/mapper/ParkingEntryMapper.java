package com.parking.parking.persistence.mapper;

import com.parking.parking.domain.ParkingEntry;
import com.parking.parking.persistence.entity.ParkingEntity;
import com.parking.parking.persistence.entity.ParkingEntryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ParkingEntryMapper {
    @Mappings({
            @Mapping(source = "id",target = "parkingId"),
            @Mapping(source = "admissionTime",target = "arrival"),
            @Mapping(source = "departureTime",target = "exit"),
    })
    ParkingEntry toParkingEntry(ParkingEntryEntity parkingEntryEntity);

    @InheritInverseConfiguration
    @Mapping(target = "bill",ignore = true)
    @Mapping(target = "vehicle",ignore = true)
    ParkingEntryEntity toParkingEntryEntity (ParkingEntry parkingEntry);
}
