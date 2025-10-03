package com.example.service;

import com.example.entity.Agente;
import com.example.repository.AgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenteServiceImpl implements AgenteService {

    @Autowired
    private AgenteRepository agenteRepository;

    @Override
    public List<Agente> findAll() {
        return agenteRepository.findAll();
    }

    @Override
    public Agente findById(Integer id) {
        return agenteRepository.findById(id).orElse(null);
    }

    @Override
    public Agente save(Agente agente) {
        return agenteRepository.save(agente);
    }

    @Override
    public void deleteById(Integer id) {
        agenteRepository.deleteById(id);
    }
}
