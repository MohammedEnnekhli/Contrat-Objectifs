package com.sounhalazoun.contrat_objectif.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"intitule"})})
public class AxeStrategique implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 3,max = 150)
    @NotNull
    @Column(unique=true)
    private String intitule;
    @Size(min = 5,max = 750)
    @NotNull
    private String description;
    @Max(value = 100)
    @Min(value = 0)
    private double tauxAvancement;
    @NotNull
    private LocalDate dateDebutPrevisionnel;
    private LocalDate dateFinPrevisionnel;
    private LocalDate dateDebutReel;
    private LocalDate dateFinReel;
    @ManyToOne
    private UniteStructurelle uniteStructurelle;
    @OneToMany(mappedBy = "axeStrategique", cascade = CascadeType.ALL)
    private Collection<Objectif> objectifs;
    @OneToMany(mappedBy = "axeStrategique", cascade = CascadeType.ALL)
    private Collection<EvaluationAxeStrategique> evaluationAxeStrategiques;
    @ManyToOne
    private Gestionnaire createdByGestionnaire;
    @OneToMany(mappedBy = "axeStrategique", cascade = CascadeType.ALL)
    private Collection<ModificationAxeStrategique> modificationAxeStrategiques;



}
