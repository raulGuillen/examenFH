package com.example.service;

import com.example.entity.Reserva;
import java.util.List;

public interface ReservaService {
    List<Reserva> findAll();
    Reserva findById(Integer id);
    Reserva save(Reserva reserva);
    void deleteById(Integer id);
}
