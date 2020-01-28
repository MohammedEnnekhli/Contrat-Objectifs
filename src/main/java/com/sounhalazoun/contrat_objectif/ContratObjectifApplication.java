package com.sounhalazoun.contrat_objectif;

import com.sounhalazoun.contrat_objectif.entities.Gestionnaire;
import com.sounhalazoun.contrat_objectif.entities.UniteStructurelle;
import com.sounhalazoun.contrat_objectif.service.IContratObjectifsInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ContratObjectifApplication implements CommandLineRunner {
    @Autowired
    private IContratObjectifsInit iContratObjectifsInit;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(ContratObjectifApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Gestionnaire.class, UniteStructurelle.class);
/*
       iContratObjectifsInit.initType();
        iContratObjectifsInit.initUnitStructurelle();
        iContratObjectifsInit.initGestionnaire();
        iContratObjectifsInit.initAxeStrategique();
        iContratObjectifsInit.initObjectif();
        iContratObjectifsInit.initPartiePrenante();
        iContratObjectifsInit.initActionCO();
        iContratObjectifsInit.initEvaluationAxeStrategique();
        iContratObjectifsInit.initModificationAxeStrategique();
        iContratObjectifsInit.initEvaluationObjectif();
        iContratObjectifsInit.initModificationObjectif();
        iContratObjectifsInit.initEvaluationActionCO();
        iContratObjectifsInit.initModificationActionCO();
*/
    }
}
