package com.sounhalazoun.contrat_objectif.entities;

import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.util.Collection;

@Projection(name = "PObj", types = Objectif.class)
public interface ProjectionObjectif {

    Long getId();

    String getIntitule();

    double getTauxAvancement();

    LocalDate getDateDebutPrevisionnel();

    LocalDate getDateFinPrevisionnel();

    LocalDate getDateDebutReel();

    LocalDate getDateFinReel();

    AxeStrategique getAxeStrategique();

    Collection<ActionCO> getActionCOS();

    Collection<EvaluationObjectif> getEvaluationObjectifs();

    Gestionnaire getCreatedByGestionnaire();

    Collection<ModificationObjectif> getModificationObjectifs();
}
