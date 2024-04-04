package io.github.RafaelPichelli.GranjaLLApi.service;

import io.github.RafaelPichelli.GranjaLLApi.enums.StatusEnum;
import io.github.RafaelPichelli.GranjaLLApi.model.Aluguel;

import java.util.List;

public interface AluguelService {
    List<Aluguel> findAllByCasaNumero(Long casaNumero);

    List<Aluguel> findAllByStatus(StatusEnum status);

    List<Aluguel> findAllByCasaNumeroAndStatus(Long casaNumero, StatusEnum status);
}
