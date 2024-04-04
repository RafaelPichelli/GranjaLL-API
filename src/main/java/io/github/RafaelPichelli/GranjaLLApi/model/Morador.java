package io.github.RafaelPichelli.GranjaLLApi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
@EntityListeners(AuditingEntityListener.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Morador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne
    @JoinColumn(name = "casa_numero")
    @JsonBackReference
    private Casa casa;

    @Column
    private String nome;

    @Column
    private String rg;

    @Column
    private String cpf;

    @Column
    private String telefone;

    @Column
    private LocalDate dataNascimento;

    @CreatedDate
    @Column
    private LocalDateTime dataCadastro;

}
