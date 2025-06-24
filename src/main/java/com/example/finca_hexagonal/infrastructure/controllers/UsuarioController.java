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


    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> findAll() {
        List<UsuarioResponseDTO> response = usuarioService.obtenerUsuarios();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> create(@RequestBody UsuarioRequestDTO dto) {
        UsuarioResponseDTO response = usuarioService.crearUsuario(dto);
        return ResponseEntity.created(URI.create("/api/usuarios/" + response.getId())).body(response);
    }

}
