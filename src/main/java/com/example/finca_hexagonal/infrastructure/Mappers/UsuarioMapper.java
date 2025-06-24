package com.example.finca_hexagonal.infrastructure.Mappers;


import com.example.finca_hexagonal.domain.models.Usuario;
import com.example.finca_hexagonal.infrastructure.entities.UsuarioEntidad;

public class UsuarioMapper {

    public static UsuarioEntidad toEntity(Usuario usuario ) {

        return new UsuarioEntidad(usuario.getId(), usuario.getNombre(),  usuario.getApellido(),  usuario.getCorreo(), usuario.getContraseña(), usuario.getTelefono());

    }

    public static Usuario toModel (UsuarioEntidad usuarioEntidad ) {
        return new Usuario(usuarioEntidad.getId(),usuarioEntidad.getNombre(), usuarioEntidad.getApellido(), usuarioEntidad.getCorreo(), usuarioEntidad.getContraseña(), usuarioEntidad.getTelefono());
    }

}
