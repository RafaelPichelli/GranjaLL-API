package io.github.RafaelPichelli.GranjaLLApi.repository;

import io.github.RafaelPichelli.GranjaLLApi.model.Casa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CasaRepository extends JpaRepository<Casa, Long> {
}
