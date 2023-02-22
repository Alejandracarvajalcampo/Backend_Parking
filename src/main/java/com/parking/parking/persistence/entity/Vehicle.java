package com.parking.parking.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "vehiculo" )
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "placa")
    private String plate;
    @Column(name = "tipo")
    private String type;
    @Column(name = "cilindraje")
    private String cylinder;

    @OneToMany(mappedBy = "vehicle")
    private List<ParkingEntry> parkingEntry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCylinder() {
        return cylinder;
    }

    public void setCylinder(String cylinder) {
        this.cylinder = cylinder;
    }
}
