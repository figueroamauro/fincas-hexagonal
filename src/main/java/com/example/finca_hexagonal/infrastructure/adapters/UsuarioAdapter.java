package com.example.finca_hexagonal.infrastructure.adapters;

import com.example.finca_hexagonal.domain.models.Usuario;
import com.example.finca_hexagonal.domain.ports.out.UsuarioOutPort;
import com.example.finca_hexagonal.infrastructure.Mappers.UsuarioMapper;
import com.example.finca_hexagonal.infrastructure.entities.UsuarioEntidad;
import com.example.finca_hexagonal.infrastructure.repositories.JPAUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioAdapter implements UsuarioOutPort {

    private final JPAUsuarioRepository jpaUsuarioRepository;

    public UsuarioAdapter(JPAUsuarioRepository jpaUsuarioRepository) {
        this.jpaUsuarioRepository = jpaUsuarioRepository;
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        UsuarioEntidad entidad = UsuarioMapper.toEntity(usuario);

        UsuarioEntidad entidadGuardada = jpaUsuarioRepository.save(entidad);

        return UsuarioMapper.toModel(entidadGuardada);
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        UsuarioEntidad entidad = UsuarioMapper.toEntity(usuario);

        UsuarioEntidad entidadGuardada = jpaUsuarioRepository.save(entidad);

        return UsuarioMapper.toModel(entidadGuardada);
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        return jpaUsuarioRepository.findAll().stream().map(p -> UsuarioMapper.toModel(p)).toList();

    }

    @Override
    public Usuario obtenerUsuarioPorId(Long id) {
        Optional<UsuarioEntidad> usuarioGuardado = jpaUsuarioRepository.findById(id);
        if (usuarioGuardado.isPresent()) {
           return UsuarioMapper.toModel(usuarioGuardado.get());

        }
        return null;
    }

    @Override
    public Boolean eliminarUsuario(Usuario usuario) {
        Optional<UsuarioEntidad> usuarioEncontrado = jpaUsuarioRepository.findById(usuario.getId());
        if (usuarioEncontrado.isPresent()) {
            jpaUsuarioRepository.delete(usuarioEncontrado.get());
            return true;
        }
        return false;
    }

    @Override
    public Boolean eliminarUsuarioPorId(Long id) {
        Optional<UsuarioEntidad> usuarioEncontrado = jpaUsuarioRepository.findById(id);
        if (usuarioEncontrado.isPresent()) {
            jpaUsuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
