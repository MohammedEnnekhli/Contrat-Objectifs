package com.sounhalazoun.contrat_objectif.dao;

import com.sounhalazoun.contrat_objectif.entities.UniteStructurelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource
@CrossOrigin("*")

public interface UniteStructurelleRepository extends JpaRepository<UniteStructurelle,Long> {

    @Query(value = "WITH cte_org AS (SELECT * FROM unite_structurelle WHERE id=?1 UNION ALL SELECT u.* FROM unite_structurelle u INNER JOIN cte_org o ON o.id = u.unite_pere_id) SELECT * FROM cte_org;", nativeQuery = true)
    @RestResource(path = "childsUnites")
    List<UniteStructurelle> findChildsUnites(@Param(value = "id") Long id);

}
