package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "destinos")
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DestinoID")
    private Integer destinoId;
    private String ciudad;
    private String pais;
    private BigDecimal costoBase;
}
