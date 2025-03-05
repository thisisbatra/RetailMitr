package com.erp.retail_mitr.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String product;
    private int quantity;

    @Column(name = "last_updated")
    private LocalDate lastUpdated;
}
