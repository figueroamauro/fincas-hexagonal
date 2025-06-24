package com.example.finca_hexagonal.application.mappers;


import com.example.finca_hexagonal.application.dto.UsuarioRequestDTO;
import com.example.finca_hexagonal.application.dto.UsuarioResponseDTO;
import com.example.finca_hexagonal.domain.models.Usuario;
import org.springframework.stereotype.Service;

@Service

public class UsuarioMapper {


    public static Usuario toModel(UsuarioRequestDTO dto) {

        return new Usuario(dto.getId(), dto.getNombre(), dto.getApellido(), dto.getCorreo(), dto.getContraseña(), dto.getTelefono());

    }

    public static UsuarioResponseDTO toDTO (Usuario usuarío) {
        return new UsuarioResponseDTO(usuarío.getId(), usuarío.getNombre(), usuarío.getApellido(), usuarío.getCorreo(), usuarío.getTelefono());
    }

}
