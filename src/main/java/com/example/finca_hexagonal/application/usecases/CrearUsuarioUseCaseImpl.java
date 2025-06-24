package com.example.finca_hexagonal.application.usecases;

import com.example.finca_hexagonal.domain.models.Usuario;
import com.example.finca_hexagonal.domain.ports.in.CrearUsuarioUseCase;
import com.example.finca_hexagonal.domain.ports.out.UsuarioOutPort;
import org.springframework.stereotype.Service;

@Service
public class CrearUsuarioUseCaseImpl implements CrearUsuarioUseCase {
private final UsuarioOutPort usuarioOutPort;

    public CrearUsuarioUseCaseImpl(UsuarioOutPort usuarioOutPort) {
        this.usuarioOutPort = usuarioOutPort;
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioOutPort.crearUsuario(usuario);


        }
    }

