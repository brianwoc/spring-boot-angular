package com.example.springbootangular.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "products_table")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String sku;
    private String name;
    private String description;
    private double unitPrice;
    private String imageUrl;
    private boolean active;
    private int unitsInStock;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
    private Category category;

}
