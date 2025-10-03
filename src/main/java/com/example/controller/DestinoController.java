package com.example.controller;

import com.example.entity.Destino;
import com.example.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoController {

    @Autowired
    private DestinoService destinoService;

    @GetMapping
    public List<Destino> findAll() {
        return destinoService.findAll();
    }

    @GetMapping("/{id}")
    public Destino findById(@PathVariable Integer id) {
        return destinoService.findById(id);
    }

    @PostMapping
    public Destino save(@RequestBody Destino destino) {
        return destinoService.save(destino);
    }

    @PutMapping("/{id}")
    public Destino update(@PathVariable Integer id, @RequestBody Destino destino) {
        destino.setDestinoId(id);
        return destinoService.save(destino);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        destinoService.deleteById(id);
    }
}
