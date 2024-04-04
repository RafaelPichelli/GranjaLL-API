package io.github.RafaelPichelli.GranjaLLApi.repository;

import io.github.RafaelPichelli.GranjaLLApi.model.Morador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MoradorRepository extends JpaRepository<Morador, Long> {

    List<Morador> findAll();

    List<Morador> findAllByCasaNumero(Long casaNumero);
}
