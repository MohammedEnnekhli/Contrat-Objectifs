package com.sounhalazoun.contrat_objectif.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})

public class UniteStructurelle implements Serializable  {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String intitule;
    private String code;
    @ManyToOne()
    @JoinColumn(name="unitePere_id")
    private UniteStructurelle uniteStructurellePere;
    @ManyToOne
    private Type type;
    @OneToMany(mappedBy = "uniteStructurelle")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<AxeStrategique> axeStrategiques;
    @OneToMany(mappedBy = "uniteStructurelle")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Gestionnaire> gestionnaires;

}
