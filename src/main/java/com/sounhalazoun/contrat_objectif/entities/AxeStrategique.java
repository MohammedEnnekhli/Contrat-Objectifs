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
public class AxeStrategique implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String intitule;
    private String description;
    private double tauxAvancement;
    private LocalDate dateDebutPrevisionnel;
    private LocalDate dateFinPrevisionnel;
    private LocalDate dateDebutReel;
    private LocalDate dateFinReel;
    @ManyToOne
    private UniteStructurelle uniteStructurelle;
    @OneToMany(mappedBy = "axeStrategique")
    private Collection<Objectif> objectifs;
    @OneToMany(mappedBy = "axeStrategique")
    private Collection<EvaluationAxeStrategique> evaluationAxeStrategiques;
    @ManyToOne
    private Gestionnaire createdByGestionnaire;
    @OneToMany(mappedBy = "axeStrategique")
    private Collection<ModificationAxeStrategique> modificationAxeStrategiques;



}
