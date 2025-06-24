package com.example.finca_hexagonal.domain.ports.in;

import com.example.finca_hexagonal.domain.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ObtenerUsuarioUseCase {
    List<Usuario> obtenerUsuarios();

    Usuario obtenerUsuarioPorId(Long id);

}
