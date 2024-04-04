package io.github.RafaelPichelli.GranjaLLApi.controller;


import io.github.RafaelPichelli.GranjaLLApi.model.Aluguel;
import io.github.RafaelPichelli.GranjaLLApi.service.AluguelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aluguel")
@RequiredArgsConstructor
public class AluguelController {

    private final AluguelService service;

    @GetMapping
    public ResponseEntity<List<Aluguel>> search(@RequestParam(name = "numeroCasa") Long numeroCasa){
        var result = service.findAllByCasaNumero(numeroCasa);

        return ResponseEntity.ok(result);
    }
}
