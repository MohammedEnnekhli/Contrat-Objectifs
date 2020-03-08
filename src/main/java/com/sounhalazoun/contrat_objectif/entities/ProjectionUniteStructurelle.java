package com.sounhalazoun.contrat_objectif.entities;

import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;

@Projection(name = "PU",types = UniteStructurelle.class)
public interface ProjectionUniteStructurelle {
     Long getId();
     String getIntitule();
     String getCode();
     UniteStructurelle getUniteStructurellePere();
     Type getType();
     Collection<AxeStrategique> getAxeStrategiques();
     Collection<Gestionnaire> getGestionnaires();
     Collection<PartiePrenante> getPartiePrenantes();
}
