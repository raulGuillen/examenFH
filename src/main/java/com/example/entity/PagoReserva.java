package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Data
@Getter
@Setter
@Table(name = "pagosreserva")
public class PagoReserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PagoID")
    private Integer pagoId;

    @ManyToOne
    @JoinColumn(name = "ReservaID")
    private Reserva reserva;

    private BigDecimal monto;
    private Date fechaPago;
    private String metodo;
}
