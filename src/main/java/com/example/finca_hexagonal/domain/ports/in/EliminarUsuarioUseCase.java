package com.example.finca_hexagonal.domain.ports.in;

import com.example.finca_hexagonal.domain.models.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface EliminarUsuarioUseCase {
    Boolean eliminarUsuario(Usuario usuario);
    Boolean eliminarUsuarioPorId(Long id);

}
