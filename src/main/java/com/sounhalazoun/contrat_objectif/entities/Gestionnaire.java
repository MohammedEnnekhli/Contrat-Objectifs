package com.sounhalazoun.contrat_objectif.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "typeUser", discriminatorType = DiscriminatorType.STRING, length = 6 )
public  class Gestionnaire implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 50)
    private String nom;
    @Size(max = 50)
    private  String prenom;
    @Column(unique = true)
    private String cIN;
    @Size(max = 20)
    private String tel;
    @Email
    @NotNull
    @Column(unique=true)
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    @ManyToOne
    private UniteStructurelle uniteStructurelle;
    @OneToMany(mappedBy = "gestionnaire")
    private Collection<EvaluationAxeStrategique> evaluationAxeStrategiques;
    @OneToMany(mappedBy = "gestionnaire")
    private Collection<EvaluationObjectif> evaluationObjectifs;
    @OneToMany(mappedBy = "gestionnaire")
    private Collection<EvaluationActionCO> evaluationActionCOS;

    @OneToMany(mappedBy = "createdByGestionnaire")
    private Collection<AxeStrategique> axeStrategiquesCreated;
    @OneToMany(mappedBy = "gestionnaire")
    private Collection<ModificationAxeStrategique> axeStrategiqueModifications;

    @OneToMany(mappedBy = "createdByGestionnaire")
    private Collection<Objectif> objectifCreated;
    @OneToMany(mappedBy = "gestionnaire")
    private Collection<ModificationObjectif> objectifModifications;

    @OneToMany(mappedBy = "createdByGestionnaire")
    private Collection<ActionCO> actionCOCreated;
    @OneToMany(mappedBy = "gestionnaire")
    private Collection<ModificationActionCO> actionCOModifications;
}

