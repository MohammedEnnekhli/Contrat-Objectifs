package com.sounhalazoun.contrat_objectif.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class AxeStrategique implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String intitule;
    private double tauxAvancement;
    @ManyToOne
    private UniteStructurelle uniteStructurelle;
    @OneToMany(mappedBy = "axeStrategique")
    private Collection<Objectif> objectifs;
    @OneToOne
    private DateCO dateCO;
    @OneToMany(mappedBy = "axeStrategique")
    private Collection<EvaluationAxeStrategique> evaluationAxeStrategiques;

}
