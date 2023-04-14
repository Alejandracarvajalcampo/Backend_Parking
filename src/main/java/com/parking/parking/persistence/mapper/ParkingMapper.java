package com.parking.parking.persistence.mapper;

import com.parking.parking.domain.Parking;
import com.parking.parking.persistence.entity.ParkingEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ParkingMapper {
    @Mappings({
            @Mapping(source = "id",target = "parkingId" ),
            @Mapping(source = "maximumCapacityCars",target = "carCapacity" ),
            @Mapping(source = "maximumCapacityMotorcycles",target = "motorcycleCapacity" ),
            @Mapping(source = "carsAvailability",target = "carSpaceAvailable" ),
            @Mapping(source = "motorcyclesAvailability",target = "motorcycleSpaceAvailable" ),
    })
    Parking toParking(ParkingEntity parkingEntity);

    @InheritInverseConfiguration
    @Mapping(target = "vehicleEntity", ignore = true)
    ParkingEntity toParkingEntity (Parking parking);
}
