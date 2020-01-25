package com.sounhalazoun.contrat_objectif.dao;

import com.sounhalazoun.contrat_objectif.entities.Gestionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GestionnaireRepository extends JpaRepository<Gestionnaire,Long> {
}