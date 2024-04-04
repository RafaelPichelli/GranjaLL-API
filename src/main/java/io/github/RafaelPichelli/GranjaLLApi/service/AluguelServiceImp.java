package io.github.RafaelPichelli.GranjaLLApi.service;

import io.github.RafaelPichelli.GranjaLLApi.enums.StatusEnum;
import io.github.RafaelPichelli.GranjaLLApi.model.Aluguel;
import io.github.RafaelPichelli.GranjaLLApi.repository.AluguelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AluguelServiceImp implements AluguelService{

    private final AluguelRepository repository;

    @Override
    public List<Aluguel> findAllByCasaNumero(Long casaNumero) {
        return repository.findAllByCasaNumero(casaNumero);
    }

    @Override
    public List<Aluguel> findAllByStatus(StatusEnum status) {
        return repository.findAllByStatus(status);
    }

    @Override
    public List<Aluguel> findAllByCasaNumeroAndStatus(Long casaNumero, StatusEnum status) {
        return repository.findAllByCasaNumeroAndStatus(casaNumero, status);
    }
}
