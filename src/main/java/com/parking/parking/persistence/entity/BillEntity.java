package com.parking.parking.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "factura")
public class BillEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "valor_pago")
    private Integer amountToBePaid;

    @OneToOne
    @JoinColumn(name = "id", insertable = false,updatable = false)
    private VehicleEntity vehicleEntity;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmountToBePaid() {
        return amountToBePaid;
    }

    public void setAmountToBePaid(Integer amountToBePaid) {
        this.amountToBePaid = amountToBePaid;
    }


}

