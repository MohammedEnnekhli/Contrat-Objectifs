package com.sounhalazoun.contrat_objectif.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Gestionnaire implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private  String prenom;
    @Column(unique = true,nullable = true)
    private String cIN;
    private String tel;
    private String email;
    private String password;
    private String grade;
    @ManyToOne
    private UniteStructurelle uniteStructurelle;
    @OneToMany(mappedBy = "gestionnaire")
    private Collection<EvaluationAxeStrategique> evaluationAxeStrategiques;
    @OneToMany(mappedBy = "gestionnaire")
    private Collection<EvaluationObjectif> evaluationObjectifs;
    @OneToMany(mappedBy = "gestionnaire")
    private Collection<EvaluationActionCO> evaluationActionCOS;
}
