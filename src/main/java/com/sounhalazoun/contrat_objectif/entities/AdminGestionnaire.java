package com.sounhalazoun.contrat_objectif.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue( "ADMIN" )
public class AdminGestionnaire extends Gestionnaire{

    @OneToMany(mappedBy = "adminGestionnaire")
    private Collection<Evaluation> evaluations;

}
