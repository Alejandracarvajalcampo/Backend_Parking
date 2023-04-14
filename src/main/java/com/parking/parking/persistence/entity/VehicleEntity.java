package com.parking.parking.persistence.entity;

import javax.persistence.*;
import java.util.Date;


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
    @Column(name = "hora_ingreso")
    private Date admissionTime;
    @Column(name = "hora_salida")
    private Date departureTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleCylinder() {
        return vehicleCylinder;
    }

    public void setVehicleCylinder(String vehicleCylinder) {
        this.vehicleCylinder = vehicleCylinder;
    }

    public Date getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(Date admissionTime) {
        this.admissionTime = admissionTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

}
