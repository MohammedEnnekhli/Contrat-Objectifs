package com.sounhalazoun.contrat_objectif.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Period;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class ActionCO implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String intitule;
    private double tauxAvancement;
    @ManyToOne
    private Objectif objectif;
    @OneToOne
    private DateCO dateCO;
    @OneToMany(mappedBy = "actionCO")
    private Collection<EvaluationActionCO> evaluationActionCOS;

}
