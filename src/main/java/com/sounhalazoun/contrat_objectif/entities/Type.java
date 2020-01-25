package com.sounhalazoun.contrat_objectif.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Type implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @OneToMany(mappedBy = "type")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<UniteStructurelle> uniteStructurelles;

}
