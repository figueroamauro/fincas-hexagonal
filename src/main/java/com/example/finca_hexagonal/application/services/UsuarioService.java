package com.example.finca_hexagonal.application.services;

import com.example.finca_hexagonal.application.dto.UsuarioRequestDTO;
import com.example.finca_hexagonal.application.dto.UsuarioResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService  {

    UsuarioResponseDTO crearUsuario(UsuarioRequestDTO usuario);

    UsuarioResponseDTO actualizarUsuario(UsuarioRequestDTO usuario);

    List<UsuarioResponseDTO> obtenerUsuarios();

    UsuarioResponseDTO obtenerUsuarioPorId(Long id);

    Boolean eliminarUsuario(UsuarioRequestDTO usuario);

    Boolean eliminarUsuarioPorId(Long id);

}
