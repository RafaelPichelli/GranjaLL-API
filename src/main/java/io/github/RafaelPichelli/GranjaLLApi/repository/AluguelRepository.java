package io.github.RafaelPichelli.GranjaLLApi.repository;

import io.github.RafaelPichelli.GranjaLLApi.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AluguelRepository extends JpaRepository<Aluguel, Long> {
    List<Aluguel> findAll();

    List<Aluguel> findAllByCasaNumero(Long casaNumero);
}
