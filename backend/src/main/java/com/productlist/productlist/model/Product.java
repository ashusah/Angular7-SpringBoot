package com.productlist.productlist.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product")
public class Product {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @NonNull
    @Column
    private String productName;

    @Column
    private String productCode;

    @Column
    private String releaseDate;

    @Column
    private String description;

    @Column
    private Double price;

    @Column
    private int starRating;

    @Column
    private String imageUrl;
}
