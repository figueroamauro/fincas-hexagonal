package com.example.finca_hexagonal.infrastructure.controllers;

import com.example.finca_hexagonal.application.dto.UsuarioRequestDTO;
import com.example.finca_hexagonal.application.dto.UsuarioResponseDTO;
import com.example.finca_hexagonal.application.services.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> create(@RequestBody UsuarioRequestDTO dto) {
        UsuarioResponseDTO response = usuarioService.crearUsuario(dto);
        return ResponseEntity.created(URI.create("/api/usuarios/" + response.getId())).body(response);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> findAll() {
        List<UsuarioResponseDTO> response = usuarioService.obtenerUsuarios();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> findById(@PathVariable Long id) {
        UsuarioResponseDTO response = usuarioService.obtenerUsuarioPorId(id);
        return ResponseEntity.ok(response);
    }

    @PutMapping
    public ResponseEntity<UsuarioResponseDTO> update(@RequestBody UsuarioRequestDTO dto) {
        UsuarioResponseDTO response = usuarioService.actualizarUsuario(dto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestBody UsuarioRequestDTO dto) {
        usuarioService.eliminarUsuario(dto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteById(Long id) {
        Boolean response = usuarioService.eliminarUsuarioPorId(id);
        return ResponseEntity.noContent().build();
    }

}
