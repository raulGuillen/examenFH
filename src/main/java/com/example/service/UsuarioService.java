package com.example.service;

import com.example.entity.Usuario;
import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario findById(Integer id);
    Usuario save(Usuario usuario);
    void deleteById(Integer id);
}
