package com.shopcom.product.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "product_details")
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(generator = "prod_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "prod_seq", initialValue = 100, allocationSize = 2)
    private Integer productId;
    private String productName;
    private Double price;
    private String manufacturerName;

}
