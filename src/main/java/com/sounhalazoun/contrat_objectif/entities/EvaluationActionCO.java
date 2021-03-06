package com.sounhalazoun.contrat_objectif.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class EvaluationActionCO implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateEvaluation;
    private double tauxAvancement;
    @ManyToOne
    private ActionCO actionCO;
    @ManyToOne
    private Gestionnaire gestionnaire;

}
