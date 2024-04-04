package io.github.RafaelPichelli.GranjaLLApi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table
@EntityListeners(AuditingEntityListener.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Casa {
    @Id
    @Column
    private Long numero;

    @OneToMany(mappedBy = "casa")
    private List<Morador> moradores;

    @Column
    private LocalDate vencimento;

    @OneToMany(mappedBy = "casa")
    private List<Aluguel> aluguel;



    //@TODO: fazer o relacionamento para o cadastro das contas de luz.

}
