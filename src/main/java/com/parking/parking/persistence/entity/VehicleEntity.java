package com.parking.parking.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "vehiculo" )
public class VehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "placa")
    private String vehiclePlate;
    @Column(name = "tipo")
    private String vehicleType;
    @Column(name = "cilindraje")
    private String vehicleCylinder;

    @OneToMany(mappedBy = "vehicle")
    private List<ParkingEntryEntity> parkingEntry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return vehiclePlate;
    }

    public void setPlate(String plate) {
        this.vehiclePlate = plate;
    }

    public String getType() {
        return vehicleType;
    }

    public void setType(String type) {
        this.vehicleType = type;
    }

    public String getCylinder() {
        return vehicleCylinder;
    }

    public void setCylinder(String cylinder) {
        this.vehicleCylinder = cylinder;
    }
}
