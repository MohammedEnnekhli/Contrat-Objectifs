package com.sounhalazoun.contrat_objectif;

import com.sounhalazoun.contrat_objectif.service.IContratObjectifsInit;
import com.sounhalazoun.contrat_objectif.service.IContratObjectifsInitImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContratObjectifApplication implements CommandLineRunner {
    @Autowired
    private IContratObjectifsInit iContratObjectifsInit;
    public static void main(String[] args) {
        SpringApplication.run(ContratObjectifApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*iContratObjectifsInit.initType();
        iContratObjectifsInit.initUnitStructurelle();
        iContratObjectifsInit.initGestionnaire();
        iContratObjectifsInit.initAxeStrategique();
        iContratObjectifsInit.initObjectif();
        iContratObjectifsInit.initActionCO();
        iContratObjectifsInit.initEvaluationAxeStrategique();
        iContratObjectifsInit.initEvaluationObjectif();
        iContratObjectifsInit.initEvaluationActionCO();
*/

    }
}
