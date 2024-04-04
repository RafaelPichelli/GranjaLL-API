package io.github.RafaelPichelli.GranjaLLApi.service;

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
    public List<Aluguel> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Aluguel> findAllByCasaNumero(Long casaNumero) {
        return repository.findAllByCasaNumero(casaNumero);
    }
}
