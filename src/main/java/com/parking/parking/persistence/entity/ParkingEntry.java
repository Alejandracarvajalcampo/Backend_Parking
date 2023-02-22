package com.parking.parking.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ingreso_parqueadero")
public class ParkingEntry {
    @EmbeddedId
    private ParkingEntryPK id;
    @Column(name = "hora_ingreso")
    private Date admissionTime;
    @Column(name = "hora_salida")
    private Date departureTime;
    @ManyToOne
    @JoinColumn(name = "id",insertable = false,updatable = false)
    private Bill bill;

    @ManyToOne
    @JoinColumn( name = "id",insertable = false,updatable = false)
    private Vehicle vehicle;

    public ParkingEntryPK getId() {
        return id;
    }

    public void setId(ParkingEntryPK id) {
        this.id = id;
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
