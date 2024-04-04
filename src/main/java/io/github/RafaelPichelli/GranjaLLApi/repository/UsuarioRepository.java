package io.github.RafaelPichelli.GranjaLLApi.repository;

import io.github.RafaelPichelli.GranjaLLApi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
