package io.github.RafaelPichelli.GranjaLLApi.service;

import io.github.RafaelPichelli.GranjaLLApi.model.Aluguel;

import java.util.List;

public interface AluguelService {
    List<Aluguel> findAll();

    List<Aluguel> findAllByCasaNumero(Long casaNumero);
}
