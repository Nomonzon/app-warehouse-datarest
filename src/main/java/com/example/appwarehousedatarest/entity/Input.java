package com.example.appwarehousedatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Input {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    @OneToOne
    private Warehouse warehouse;

    @OneToOne
    private Currency currency;

    @OneToOne
    private Supplier supplier;

    @OneToOne
    private InputProduct inputProduct;

    private Integer facture_number;


    private String code;

}
