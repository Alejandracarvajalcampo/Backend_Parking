package com.parking.parking.persistence.mapper;

import com.parking.parking.domain.Vehicle;
import com.parking.parking.persistence.entity.VehicleEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface VehicleMapper {
    @Mappings({
            @Mapping(source = "id",target = "vehicleId"),
            @Mapping(source = "vehiclePlate",target = "plate"),
            @Mapping(source = "vehicleCylinder",target = "cylinder"),

    })
    Vehicle toVehicle(VehicleEntity vehicleEntity);

    @InheritInverseConfiguration
    @Mapping(target = "parkingEntry", ignore = true)
    VehicleEntity toVehicleEntity(Vehicle vehicle);

}
