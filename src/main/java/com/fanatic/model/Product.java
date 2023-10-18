package com.fanatic.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
@Accessors(chain = true)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "url_image",nullable = false)
    private String urlImage;

    @Column(name = "stop_selling",columnDefinition = "boolean default false")
    private boolean stopSelling;

    @Column(nullable = false)
    private String title;

    private BigDecimal price;

    private int quantity;

}
