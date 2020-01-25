package com.sounhalazoun.contrat_objectif.dao;

import com.sounhalazoun.contrat_objectif.entities.EvaluationActionCO;
import com.sounhalazoun.contrat_objectif.entities.EvaluationAxeStrategique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EvaluationActionCORepository extends JpaRepository<EvaluationActionCO,Long> {

}
