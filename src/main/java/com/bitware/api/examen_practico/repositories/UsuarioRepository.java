package com.bitware.api.examen_practico.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bitware.api.examen_practico.models.Usuario;


public interface UsuarioRepository extends CrudRepository < Usuario, String>{
    Optional<Usuario> findByEmail(String email);
    boolean existsByEmail(String email);
}
