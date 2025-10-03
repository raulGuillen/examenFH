package com.example.service;

import com.example.entity.Agente;
import java.util.List;

public interface AgenteService {
    List<Agente> findAll();
    Agente findById(Integer id);
    Agente save(Agente agente);
    void deleteById(Integer id);
}
