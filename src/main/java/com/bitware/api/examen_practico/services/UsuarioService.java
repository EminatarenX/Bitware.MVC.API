package com.bitware.api.examen_practico.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bitware.api.examen_practico.common.ResourceNotFoundException;
import com.bitware.api.examen_practico.models.Usuario;
import com.bitware.api.examen_practico.repositories.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario findById(String id) {
        return usuarioRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado con id: " + id));
    }

    public Usuario create(Usuario usuario) {
        if (usuarioRepository.existsByEmail(usuario.getEmail())) {
            throw new RuntimeException("El email ya esta registrado");

        }
        return usuarioRepository.save(usuario);
    }

    public Usuario update(String id, Usuario userData) {
        Usuario usuario = findById(id);
        usuario.setNombre(userData.getNombre());
        usuario.setEmail(userData.getEmail());
        usuario.setPassword(userData.getPassword());

        return usuarioRepository.save(usuario);
    }

    public void delete(String id) {
        Usuario usuario = findById(id);
        usuarioRepository.delete(usuario);
    }
}
