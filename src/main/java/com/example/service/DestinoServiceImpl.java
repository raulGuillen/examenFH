package com.example.service;

import com.example.entity.Destino;
import com.example.repository.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoServiceImpl implements DestinoService {

    @Autowired
    private DestinoRepository destinoRepository;

    @Override
    public List<Destino> findAll() {
        return destinoRepository.findAll();
    }

    @Override
    public Destino findById(Integer id) {
        return destinoRepository.findById(id).orElse(null);
    }

    @Override
    public Destino save(Destino destino) {
        return destinoRepository.save(destino);
    }

    @Override
    public void deleteById(Integer id) {
        destinoRepository.deleteById(id);
    }
}
