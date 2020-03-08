package com.sounhalazoun.contrat_objectif.entities;

import org.springframework.data.rest.core.config.Projection;

import javax.persistence.*;

@Projection(name = "PG",types = Gestionnaire.class)
public interface ProjectionGestionnaire {

 Long getId();
String getNom();
 String getPrenom();
 String getCIN();
 String getTel();
 String getEmail();
 String getPassword();
 UniteStructurelle getUniteStructurelle();
}
