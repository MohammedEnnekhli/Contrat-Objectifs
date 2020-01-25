package com.sounhalazoun.contrat_objectif.dao;

import com.sounhalazoun.contrat_objectif.entities.EvaluationAxeStrategique;
import com.sounhalazoun.contrat_objectif.entities.EvaluationObjectif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EvaluationObjectifRepository extends JpaRepository<EvaluationObjectif,Long> {

}
