package com.erp.retail_mitr.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String customer;
    private String products;
    private double totalAmount;
    private String status;
}
