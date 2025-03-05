package com.erp.retail_mitr.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long id;
    private String name;
    private String email;
    private String password;
    private String role;
    
}
