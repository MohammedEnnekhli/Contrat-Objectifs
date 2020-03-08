package com.sounhalazoun.contrat_objectif.entities;

import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(name = "PObjModi", types = ModificationObjectif.class)
public interface ProjectionModificationObjectif {
   Long getId();
  LocalDate getDateModification();

   Objectif getObjectif();

    Gestionnaire getGestionnaire();
}
