package com.sounhalazoun.contrat_objectif.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Objectif implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String intitule;
    private double tauxAvancement;
    private LocalDate dateDebutPrevisionnel;
    private LocalDate dateFinPrevisionnel;
    private LocalDate dateDebutReel;
    private LocalDate dateFinReel;
    @ManyToOne
    private AxeStrategique axeStrategique;
    @OneToMany(mappedBy = "objectif")
    private Collection<EvaluationObjectif> evaluationObjectifs;
    @OneToMany(mappedBy = "objectif")
    private Collection<ActionCO> actionCOS;
    @ManyToOne
    private Gestionnaire createdByGestionnaire;
    @OneToMany(mappedBy = "objectif")
    private Collection<ModificationObjectif> modificationObjectifs;
    @OneToMany(mappedBy = "objectif")
    private Collection<PartiePrenante> partiePrenantes;


}
