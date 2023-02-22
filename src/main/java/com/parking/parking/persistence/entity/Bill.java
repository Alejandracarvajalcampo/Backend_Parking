package com.parking.parking.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "factura")
public class Bill {

    @EmbeddedId
    private BillPK id;
    @Column(name = "valor_pago")
    private Integer amountToBePaid;
    @OneToMany(mappedBy = "bill")
    private List<ParkingEntry> parkingEntry;

    public BillPK getId() {
        return id;
    }

    public void setId(BillPK id) {
        this.id = id;
    }

    public Integer getAmountToBePaid() {
        return amountToBePaid;
    }

    public void setAmountToBePaid(Integer amountToBePaid) {
        this.amountToBePaid = amountToBePaid;
    }
}
