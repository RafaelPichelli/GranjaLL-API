package io.github.RafaelPichelli.GranjaLLApi.controller;


import io.github.RafaelPichelli.GranjaLLApi.enums.StatusEnum;
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
    public ResponseEntity<List<Aluguel>> search(@RequestParam(name = "numeroCasa", required = false) Long numeroCasa, @RequestParam(name = "status", required = false) StatusEnum status) {
        List<Aluguel> result;

        if (numeroCasa != null && status != null) {
            result = service.findAllByCasaNumeroAndStatus(numeroCasa, status);
        } else if (numeroCasa != null) {
            result = service.findAllByCasaNumero(numeroCasa);
        } else if (status != null) {
            result = service.findAllByStatus(status);
        } else {
            return ResponseEntity.badRequest().build();
        }

        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(result);
    }
}
