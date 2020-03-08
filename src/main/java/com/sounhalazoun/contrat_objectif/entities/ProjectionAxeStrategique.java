package com.sounhalazoun.contrat_objectif.entities;

import org.springframework.data.rest.core.config.Projection;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Collection;

@Projection(name = "PAxe", types = AxeStrategique.class)
public interface ProjectionAxeStrategique {

    Long getId();

    String getIntitule();

    String getDescription();

    double getTauxAvancement();

    LocalDate getDateDebutPrevisionnel();

    LocalDate getDateFinPrevisionnel();

    LocalDate getDateDebutReel();

    LocalDate getDateFinReel();

    UniteStructurelle getUniteStructurelle();

    Collection<ProjectionObjectif> getObjectifs();

    Collection<ProjectionEvaluationAxeStrategique> getEvaluationAxeStrategiques();

    Gestionnaire getCreatedByGestionnaire();

    Collection<ProjectionModificationAxeStrategique> getModificationAxeStrategiques();
}
