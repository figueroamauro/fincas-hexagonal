package com.example.finca_hexagonal.application.usecases;

import com.example.finca_hexagonal.domain.models.Usuario;
import com.example.finca_hexagonal.domain.ports.in.ActualizarUsuarioUseCase;
import com.example.finca_hexagonal.domain.ports.out.UsuarioOutPort;
import org.springframework.stereotype.Service;

@Service
public class ActualizarUsuarioUseCaseimpl implements ActualizarUsuarioUseCase {
    private final UsuarioOutPort usuarioOutPort;

    public ActualizarUsuarioUseCaseimpl(UsuarioOutPort usuarioOutPort) {
        this.usuarioOutPort = usuarioOutPort;
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        return usuarioOutPort.actualizarUsuario( usuario);
    }
}
