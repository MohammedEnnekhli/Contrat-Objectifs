package com.sounhalazoun.contrat_objectif.entities;

import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.util.Collection;

@Projection(name = "PAxeModi", types = ModificationAxeStrategique.class)
public interface ProjectionModificationAxeStrategique {
   Long getId();
  LocalDate getDateModification();

   AxeStrategique getAxeStrategique();

    Gestionnaire getGestionnaire();
}
