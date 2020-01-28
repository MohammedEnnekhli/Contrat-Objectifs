package com.sounhalazoun.contrat_objectif.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})

public class UniteStructurelle implements Serializable  {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 150)
    private String intitule;
    @Size(max = 50)
    private String code;
    @ManyToOne()
    @JoinColumn(name="unitePere_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private UniteStructurelle uniteStructurellePere;
    @ManyToOne
    private Type type;
    @OneToMany(mappedBy = "uniteStructurelle")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<AxeStrategique> axeStrategiques;
    @OneToMany(mappedBy = "uniteStructurelle")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Gestionnaire> gestionnaires;

    @OneToMany(mappedBy = "uniteStructurelle")
    private Collection<PartiePrenante> partiePrenantes;

}
