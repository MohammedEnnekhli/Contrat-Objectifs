package com.sounhalazoun.contrat_objectif.entities;

import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(name = "PActEval", types = EvaluationActionCO.class)
public interface ProjectionEvaluationAction {
   Long getId();
  LocalDate getDateEvaluation();
    double getTauxAvancement();

   ActionCO getActionCO();

    Gestionnaire getGestionnaire();

}
