package com.parking.parking.persistence.entity;

import javax.persistence.*;

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

    public Integer getCarAvailability() {
        return carsAvailability;
    }

    public void setCarAvailability(Integer carAvailability) {
        this.carsAvailability = carAvailability;
    }

    public Integer getMotorcycleAvailability() {
        return motorcyclesAvailability;
    }

    public void setMotorcycleAvailability(Integer motorcycleAvailability) {
        this.motorcyclesAvailability = motorcycleAvailability;
    }
}
