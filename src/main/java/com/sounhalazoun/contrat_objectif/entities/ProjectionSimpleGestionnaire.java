package com.sounhalazoun.contrat_objectif.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "PSG",types = SimpleGestionnaire.class)
public interface ProjectionSimpleGestionnaire {

 Long getId();
String getNom();
 String getPrenom();
 String getCIN();
 String getTel();
 String getEmail();
 String getPassword();
 boolean getActive();
 UniteStructurelle getUniteStructurelle();

}
