package com.example.finca_hexagonal.domain.ports.out;

import com.example.finca_hexagonal.domain.models.Usuario;

import java.util.List;

public interface UsuarioOutPort {

    Usuario crearUsuario(Usuario usuario);

    Usuario actualizarUsuario(Usuario usuario);

    List<Usuario> obtenerUsuarios();

    Usuario obtenerUsuarioPorId(Long id);

    Boolean eliminarUsuario(Usuario usuario);

    Boolean eliminarUsuarioPorId(Long id);

}
