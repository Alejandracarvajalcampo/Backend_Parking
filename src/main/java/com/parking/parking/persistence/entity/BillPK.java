package com.parking.parking.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BillPK implements Serializable {
    private Integer id;
    @Column(name = "id_ingreso_parqueadero")
    private Integer parkingEntryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParkingEntryId() {
        return parkingEntryId;
    }

    public void setParkingEntryId(Integer parkingEntryId) {
        this.parkingEntryId = parkingEntryId;
    }
}
