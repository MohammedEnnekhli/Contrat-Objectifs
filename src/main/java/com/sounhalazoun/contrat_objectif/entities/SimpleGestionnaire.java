package com.sounhalazoun.contrat_objectif.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue( "Simple" )
public class SimpleGestionnaire extends Gestionnaire{
private boolean active;
}
