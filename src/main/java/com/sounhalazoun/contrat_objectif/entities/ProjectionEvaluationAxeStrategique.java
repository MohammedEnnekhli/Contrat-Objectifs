package com.sounhalazoun.contrat_objectif.entities;

import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(name = "PAxeEval", types = EvaluationAxeStrategique.class)
public interface ProjectionEvaluationAxeStrategique {
   Long getId();
  LocalDate getDateEvaluation();
    double getTauxAvancement();

   AxeStrategique getAxeStrategique();

    Gestionnaire getGestionnaire();

}
