package com.parking.parking.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "parqueadero")
public class ParkingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "capa_maxima_carros")
    private Integer maximumCapacityCars;
    @Column(name = "capa_maxima_motos")
    private Integer maximumCapacityMotorcycles;
    @Column(name = "dispo_carros")
    private Integer carsAvailability;
    @Column(name = "dispo_motos")
    private Integer motorcyclesAvailability;

    // Que columna en la tabla Tuition tiene la FK
    @OneToOne
    @JoinColumn(name = "id", insertable = false,updatable = false)
    private VehicleEntity vehicleEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaximumCapacityCars() {
        return maximumCapacityCars;
    }

    public void setMaximumCapacityCars(Integer maximumCapacityCars) {
        this.maximumCapacityCars = maximumCapacityCars;
    }

    public Integer getMaximumCapacityMotorcycles() {
        return maximumCapacityMotorcycles;
    }

    public void setMaximumCapacityMotorcycles(Integer maximumCapacityMotorcycles) {
        this.maximumCapacityMotorcycles = maximumCapacityMotorcycles;
    }

    public Integer getCarsAvailability() {
        return carsAvailability;
    }

    public void setCarsAvailability(Integer carsAvailability) {
        this.carsAvailability = carsAvailability;
    }

    public Integer getMotorcyclesAvailability() {
        return motorcyclesAvailability;
    }

    public void setMotorcyclesAvailability(Integer motorcyclesAvailability) {
        this.motorcyclesAvailability = motorcyclesAvailability;
    }

    public VehicleEntity getVehicleEntity() {
        return vehicleEntity;
    }

    public void setVehicleEntity(VehicleEntity vehicleEntity) {
        this.vehicleEntity = vehicleEntity;
    }
}
