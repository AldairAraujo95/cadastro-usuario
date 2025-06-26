package com.araujo.cadastro_usuario.infrastructure.repository;

import com.araujo.cadastro_usuario.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    @Transactional // anotação que informa caso dê algum erro nao vai deletar
    void deleteByEmail(String email);
}
