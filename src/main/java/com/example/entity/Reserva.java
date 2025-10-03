package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ReservaID")
    private Integer reservaId;

    @ManyToOne
    @JoinColumn(name = "UsuarioID")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "AgenteID")
    private Agente agente;

    @ManyToOne
    @JoinColumn(name = "DestinoID")
    private Destino destino;

    private Date fechaReserva;
    private Date fechaViaje;
}
