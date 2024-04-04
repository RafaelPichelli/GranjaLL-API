package io.github.RafaelPichelli.GranjaLLApi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.github.RafaelPichelli.GranjaLLApi.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Entity
@Table
@EntityListeners(AuditingEntityListener.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne
    @JoinColumn(name = "casa_numero")
    @JsonIgnoreProperties({"aluguel", "moradores", "vencimento"})
    private Casa casa;

    @Column
    private String valor;

    @Column
    private LocalDate vencimento;

    @Column
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

}
