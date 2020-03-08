package com.sounhalazoun.contrat_objectif;

import com.sounhalazoun.contrat_objectif.entities.*;
import com.sounhalazoun.contrat_objectif.service.IContratObjectifsInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ContratObjectifApplication implements CommandLineRunner {
    @Autowired
    private IContratObjectifsInit iContratObjectifsInit;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(ContratObjectifApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Gestionnaire.class,SimpleGestionnaire.class, UniteStructurelle.class, AxeStrategique.class, Objectif.class,
                ActionCO.class,Evaluation.class,ModificationAxeStrategique.class,ModificationObjectif.class,ModificationActionCO.class,
                EvaluationAxeStrategique.class,EvaluationObjectif.class,EvaluationActionCO.class);
/*
       iContratObjectifsInit.initType();
        iContratObjectifsInit.initUnitStructurelle();
        iContratObjectifsInit.initGestionnaire();
        iContratObjectifsInit.initEvaluation();
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
