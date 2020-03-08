package com.sounhalazoun.contrat_objectif.entities;

import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(name = "PObjEval", types = EvaluationObjectif.class)
public interface ProjectionEvaluationObjectif {
   Long getId();
  LocalDate getDateEvaluation();
    double getTauxAvancement();

   Objectif getObjectif();

    Gestionnaire getGestionnaire();

}
