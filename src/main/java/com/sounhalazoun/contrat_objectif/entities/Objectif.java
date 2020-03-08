package com.sounhalazoun.contrat_objectif.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Objectif implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 3,max = 150)
    @NotNull
    @Column(unique=true)
    private String intitule;
    @Max(value = 100)
    @Min(value = 0)
    private double tauxAvancement;
    @NotNull
    private LocalDate dateDebutPrevisionnel;
    private LocalDate dateFinPrevisionnel;
    private LocalDate dateDebutReel;
    private LocalDate dateFinReel;
    @ManyToOne
    private AxeStrategique axeStrategique;
    @OneToMany(mappedBy = "objectif", cascade = CascadeType.ALL)
    private Collection<EvaluationObjectif> evaluationObjectifs;
    @OneToMany(mappedBy = "objectif", cascade = CascadeType.ALL)
    private Collection<ActionCO> actionCOS;
    @ManyToOne
    private Gestionnaire createdByGestionnaire;
    @OneToMany(mappedBy = "objectif", cascade = CascadeType.ALL)
    private Collection<ModificationObjectif> modificationObjectifs;
    @OneToMany(mappedBy = "objectif", cascade = CascadeType.ALL)
    private Collection<PartiePrenante> partiePrenantes;


}
