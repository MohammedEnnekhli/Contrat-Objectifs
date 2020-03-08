package com.sounhalazoun.contrat_objectif.entities;

import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(name = "PActModi", types = ModificationActionCO.class)
public interface ProjectionModificationAction {
   Long getId();
  LocalDate getDateModification();

   ActionCO getActionCO();

    Gestionnaire getGestionnaire();
}
