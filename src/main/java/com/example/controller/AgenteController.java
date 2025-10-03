package com.example.controller;

import com.example.entity.Agente;
import com.example.service.AgenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agentes")
public class AgenteController {

    @Autowired
    private AgenteService agenteService;

    @GetMapping
    public List<Agente> findAll() {
        return agenteService.findAll();
    }

    @GetMapping("/{id}")
    public Agente findById(@PathVariable Integer id) {
        return agenteService.findById(id);
    }

    @PostMapping
    public Agente save(@RequestBody Agente agente) {
        return agenteService.save(agente);
    }

    @PutMapping("/{id}")
    public Agente update(@PathVariable Integer id, @RequestBody Agente agente) {
        agente.setAgenteId(id);
        return agenteService.save(agente);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        agenteService.deleteById(id);
    }
}
