package com.example.service;

import com.example.entity.Destino;
import java.util.List;

public interface DestinoService {
    List<Destino> findAll();
    Destino findById(Integer id);
    Destino save(Destino destino);
    void deleteById(Integer id);
}
