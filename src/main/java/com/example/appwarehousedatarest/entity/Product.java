package com.example.appwarehousedatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String code;

    private boolean active;

    @ManyToOne
    private Category category;

    @OneToMany
    @Column(name = "photo_id")
    private List<Attachment> attachment;

    @OneToOne
    private Measurement measurement;
}
