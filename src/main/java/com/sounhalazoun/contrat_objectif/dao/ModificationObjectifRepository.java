package com.sounhalazoun.contrat_objectif.dao;

import com.sounhalazoun.contrat_objectif.entities.ModificationObjectif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin("*")

public interface ModificationObjectifRepository extends JpaRepository<ModificationObjectif, Long> {

}
