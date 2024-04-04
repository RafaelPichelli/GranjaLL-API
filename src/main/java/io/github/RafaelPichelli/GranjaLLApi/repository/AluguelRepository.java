package io.github.RafaelPichelli.GranjaLLApi.repository;

import io.github.RafaelPichelli.GranjaLLApi.enums.StatusEnum;
import io.github.RafaelPichelli.GranjaLLApi.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AluguelRepository extends JpaRepository<Aluguel, Long> {
    List<Aluguel> findAllByCasaNumero(Long casaNumero);

    List<Aluguel> findAllByStatus(StatusEnum status);

    List<Aluguel> findAllByCasaNumeroAndStatus(Long casaNumero, StatusEnum status);
}
