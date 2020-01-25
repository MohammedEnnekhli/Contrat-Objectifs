package com.sounhalazoun.contrat_objectif.dao;

import com.sounhalazoun.contrat_objectif.entities.UniteStructurelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface UniteStructurelleRepository extends JpaRepository<UniteStructurelle,Long> {


      public List<UniteStructurelle> findUniteStructurellesByUniteStructurellePere(@Param("uniteStructurelles") UniteStructurelle u);
}
