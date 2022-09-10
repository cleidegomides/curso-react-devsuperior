package com.devsuperior.backend.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "tb_sales")
 public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sellerName;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

}
