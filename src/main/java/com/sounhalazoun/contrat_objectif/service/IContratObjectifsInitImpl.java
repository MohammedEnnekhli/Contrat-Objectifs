package com.sounhalazoun.contrat_objectif.service;

import com.sounhalazoun.contrat_objectif.dao.*;
import com.sounhalazoun.contrat_objectif.entities.*;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;


@Service
@Transactional
public class IContratObjectifsInitImpl implements IContratObjectifsInit {

    @Autowired
    private TypeRepository typeRepository;
    @Autowired
    private UniteStructurelleRepository uniteStructurelleRepository;
    @Autowired
    private AxeStrategiqueRepository axeStrategiqueRepository;
    @Autowired
    private ObjectifRepository objectifRepository;
    @Autowired
    private ActionCORepository actionCORepository;
    @Autowired
    private GestionnaireRepository gestionnaireRepository;
    @Autowired
    private  EvaluationAxeStrategiqueRepository evaluationAxeStrategiqueRepository;
    @Autowired
    private EvaluationObjectifRepository evaluationObjectifRepository;
    @Autowired
    private EvaluationActionCORepository evaluationActionCORepository;
    @Autowired
    private ModificationAxeStrategiqueRepository modificationAxeStrategiqueRepository;
    @Autowired
    private ModificationObjectifRepository modificationObjectifRepository;
    @Autowired
    private ModificationActionCORepository modificationActionCORepository;
    @Autowired
    private PartiePrenanteRepository partiePrenanteRepository;
    @Autowired
    private AdminGestionnaireRepository adminGestionnaireRepository;
    @Autowired
    private SimpleGestionnaireRepository simpleGestionnaireRepository;
    @Autowired
    private EvaluationRepository evaluationRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private Lorem lorem = new LoremIpsum();


    @Override
    public void initUnitStructurelle() {
        UniteStructurelle uniteStructurelle1 =new UniteStructurelle();
        uniteStructurelle1.setIntitule("Ministre de l’Economie, des Finances et de la Réforme de l’Administration");
        uniteStructurelle1.setCode("MEFRA");
        uniteStructurelle1.setType(typeRepository.getOne(1L));
        uniteStructurelleRepository.save(uniteStructurelle1);
        UniteStructurelle uniteStructurelle2 =new UniteStructurelle();
        uniteStructurelle2.setIntitule("Secrétariat Général");
        uniteStructurelle2.setCode("SG");
        uniteStructurelle2.setUniteStructurellePere(uniteStructurelle1);
        uniteStructurelle2.setType(typeRepository.getOne(2L));
        uniteStructurelleRepository.save(uniteStructurelle2);
        UniteStructurelle uniteStructurelle31 =new UniteStructurelle();
        uniteStructurelle31.setIntitule("Inspection Générale des Finances");
        uniteStructurelle31.setCode("IGF");
        uniteStructurelle31.setUniteStructurellePere(uniteStructurelle2);
        uniteStructurelle31.setType(typeRepository.getOne(3L));
        uniteStructurelleRepository.save(uniteStructurelle31);
        UniteStructurelle uniteStructurelle32 =new UniteStructurelle();
        uniteStructurelle32.setIntitule("Administration des Douanes & Impôts Indirects");
        uniteStructurelle32.setCode("ADII");
        uniteStructurelle32.setUniteStructurellePere(uniteStructurelle2);
        uniteStructurelle32.setType(typeRepository.getOne(3L));
        uniteStructurelleRepository.save(uniteStructurelle32);
        UniteStructurelle uniteStructurelle33 =new UniteStructurelle();
        uniteStructurelle33.setIntitule("Trésorerie Générale du Royaume");
        uniteStructurelle33.setCode("TGR");
        uniteStructurelle33.setUniteStructurellePere(uniteStructurelle2);
        uniteStructurelle33.setType(typeRepository.getOne(3L));
        uniteStructurelleRepository.save(uniteStructurelle33);
        UniteStructurelle uniteStructurelle34 =new UniteStructurelle();
        uniteStructurelle34.setIntitule("Direction Générale des Impôts (PI)");
        uniteStructurelle34.setCode("DGI");
        uniteStructurelle34.setUniteStructurellePere(uniteStructurelle2);
        uniteStructurelle34.setType(typeRepository.getOne(3L));
        uniteStructurelleRepository.save(uniteStructurelle34);
        UniteStructurelle uniteStructurelle35 =new UniteStructurelle();
        uniteStructurelle35.setIntitule("Direction du Budget");
        uniteStructurelle35.setCode("DB");
        uniteStructurelle35.setUniteStructurellePere(uniteStructurelle2);
        uniteStructurelle35.setType(typeRepository.getOne(3L));
        uniteStructurelleRepository.save(uniteStructurelle35);
        UniteStructurelle uniteStructurelle36 =new UniteStructurelle();
        uniteStructurelle36.setIntitule("Direction du Trésor et des Finances Extérieures");
        uniteStructurelle36.setCode("DTFE");
        uniteStructurelle36.setUniteStructurellePere(uniteStructurelle2);
        uniteStructurelle36.setType(typeRepository.getOne(3L));
        uniteStructurelleRepository.save(uniteStructurelle36);
        UniteStructurelle uniteStructurelle37 =new UniteStructurelle();
        uniteStructurelle37.setIntitule("Direction des Entreprises Publiques et de la Privatisation");
        uniteStructurelle37.setCode("DEPP");
        uniteStructurelle37.setUniteStructurellePere(uniteStructurelle2);
        uniteStructurelle37.setType(typeRepository.getOne(3L));
        uniteStructurelleRepository.save(uniteStructurelle37);
        UniteStructurelle uniteStructurelle38 =new UniteStructurelle();
        uniteStructurelle38.setIntitule("Direction des Domaines de l'Etat");
        uniteStructurelle38.setCode("DDE");
        uniteStructurelle38.setUniteStructurellePere(uniteStructurelle2);
        uniteStructurelle38.setType(typeRepository.getOne(3L));
        uniteStructurelleRepository.save(uniteStructurelle38);
        UniteStructurelle uniteStructurelle39 =new UniteStructurelle();
        uniteStructurelle39.setIntitule("Direction des Affaires Administratives & Générales");
        uniteStructurelle39.setCode("DAAG");
        uniteStructurelle39.setUniteStructurellePere(uniteStructurelle2);
        uniteStructurelle39.setType(typeRepository.getOne(3L));
        uniteStructurelleRepository.save(uniteStructurelle39);
        UniteStructurelle uniteStructurelle30 =new UniteStructurelle();
        uniteStructurelle30.setIntitule("Direction des Etudes & des Prévisions Financières");
        uniteStructurelle30.setCode("DEPF");
        uniteStructurelle30.setUniteStructurellePere(uniteStructurelle2);
        uniteStructurelle30.setType(typeRepository.getOne(3L));
        uniteStructurelleRepository.save(uniteStructurelle30);
        UniteStructurelle uniteStructurelle301 =new UniteStructurelle();
        uniteStructurelle301.setIntitule("Agence Judiciaire du Royaume");
        uniteStructurelle301.setCode("AJR");
        uniteStructurelle301.setUniteStructurellePere(uniteStructurelle2);
        uniteStructurelle301.setType(typeRepository.getOne(3L));
        uniteStructurelleRepository.save(uniteStructurelle301);
        UniteStructurelle uniteStructurelle41=new UniteStructurelle();
        uniteStructurelle41.setIntitule("P1/DAAG");
        uniteStructurelle41.setCode("P1/DAAG");
        uniteStructurelle41.setUniteStructurellePere(uniteStructurelle39);
        uniteStructurelle41.setType(typeRepository.getOne(4L));
        uniteStructurelleRepository.save(uniteStructurelle41);
        UniteStructurelle uniteStructurelle42=new UniteStructurelle();
        uniteStructurelle42.setIntitule("P2/DAAG");
        uniteStructurelle42.setCode("P2/DAAG");
        uniteStructurelle42.setUniteStructurellePere(uniteStructurelle39);
        uniteStructurelle42.setType(typeRepository.getOne(4L));
        uniteStructurelleRepository.save(uniteStructurelle42);
        UniteStructurelle uniteStructurelle43=new UniteStructurelle();
        uniteStructurelle43.setIntitule("P3/DAAG");
        uniteStructurelle43.setCode("P3/DAAG");
        uniteStructurelle43.setUniteStructurellePere(uniteStructurelle39);
        uniteStructurelle43.setType(typeRepository.getOne(4L));
        uniteStructurelleRepository.save(uniteStructurelle43);
        UniteStructurelle uniteStructurelle51=new UniteStructurelle();
        uniteStructurelle51.setIntitule("D1/P1/DAAG");
        uniteStructurelle51.setCode("D1/P1/DAAG");
        uniteStructurelle51.setUniteStructurellePere(uniteStructurelle41);
        uniteStructurelle51.setType(typeRepository.getOne(5L));
        uniteStructurelleRepository.save(uniteStructurelle51);
        UniteStructurelle uniteStructurelle52=new UniteStructurelle();
        uniteStructurelle52.setIntitule("D2/P1/DAAG");
        uniteStructurelle52.setCode("D2/P1/DAAG");
        uniteStructurelle52.setUniteStructurellePere(uniteStructurelle41);
        uniteStructurelle52.setType(typeRepository.getOne(5L));
        uniteStructurelleRepository.save(uniteStructurelle52);
        UniteStructurelle uniteStructurelle53=new UniteStructurelle();
        uniteStructurelle53.setIntitule("D3/P1/DAAG");
        uniteStructurelle53.setCode("D3/P1/DAAG");
        uniteStructurelle53.setUniteStructurellePere(uniteStructurelle41);
        uniteStructurelle53.setType(typeRepository.getOne(5L));
        uniteStructurelleRepository.save(uniteStructurelle53);
        UniteStructurelle uniteStructurelle54=new UniteStructurelle();
        uniteStructurelle54.setIntitule("D1/P2/DAAG");
        uniteStructurelle54.setCode("D1/P2/DAAG");
        uniteStructurelle54.setUniteStructurellePere(uniteStructurelle42);
        uniteStructurelle54.setType(typeRepository.getOne(5L));
        uniteStructurelleRepository.save(uniteStructurelle54);
        UniteStructurelle uniteStructurelle55=new UniteStructurelle();
        uniteStructurelle55.setIntitule("D2/P2/DAAG");
        uniteStructurelle55.setCode("D2/P2/DAAG");
        uniteStructurelle55.setUniteStructurellePere(uniteStructurelle42);
        uniteStructurelle55.setType(typeRepository.getOne(5L));
        uniteStructurelleRepository.save(uniteStructurelle55);
        UniteStructurelle uniteStructurelle56=new UniteStructurelle();
        uniteStructurelle56.setIntitule("D3/P2/DAAG");
        uniteStructurelle56.setCode("D3/P2/DAAG");
        uniteStructurelle56.setUniteStructurellePere(uniteStructurelle42);
        uniteStructurelle56.setType(typeRepository.getOne(5L));
        uniteStructurelleRepository.save(uniteStructurelle56);
        UniteStructurelle uniteStructurelle57=new UniteStructurelle();
        uniteStructurelle57.setIntitule("D1/P3/DAAG");
        uniteStructurelle57.setCode("D1/P3/DAAG");
        uniteStructurelle57.setUniteStructurellePere(uniteStructurelle43);
        uniteStructurelle57.setType(typeRepository.getOne(5L));
        uniteStructurelleRepository.save(uniteStructurelle57);
        UniteStructurelle uniteStructurelle58=new UniteStructurelle();
        uniteStructurelle58.setIntitule("D2/P3/DAAG");
        uniteStructurelle58.setCode("D2/P3/DAAG");
        uniteStructurelle58.setUniteStructurellePere(uniteStructurelle43);
        uniteStructurelle58.setType(typeRepository.getOne(5L));
        uniteStructurelleRepository.save(uniteStructurelle58);
        UniteStructurelle uniteStructurelle59=new UniteStructurelle();
        uniteStructurelle59.setIntitule("D3/P3/DAAG");
        uniteStructurelle59.setCode("D3/P3/DAAG");
        uniteStructurelle59.setUniteStructurellePere(uniteStructurelle43);
        uniteStructurelle59.setType(typeRepository.getOne(5L));
        uniteStructurelleRepository.save(uniteStructurelle59);
        UniteStructurelle uniteStructurelle61=new UniteStructurelle();
        uniteStructurelle61.setIntitule("S1/D1/P1/DAAG");
        uniteStructurelle61.setCode("S1/D1/P1/DAAG");
        uniteStructurelle61.setUniteStructurellePere(uniteStructurelle51);
        uniteStructurelle61.setType(typeRepository.getOne(6L));
        uniteStructurelleRepository.save(uniteStructurelle61);
        UniteStructurelle uniteStructurelle62=new UniteStructurelle();
        uniteStructurelle62.setIntitule("S2/D1/P1/DAAG");
        uniteStructurelle62.setCode("S2/D1/P1/DAAG");
        uniteStructurelle62.setUniteStructurellePere(uniteStructurelle51);
        uniteStructurelle62.setType(typeRepository.getOne(6L));
        uniteStructurelleRepository.save(uniteStructurelle62);
        UniteStructurelle uniteStructurelle63=new UniteStructurelle();
        uniteStructurelle63.setIntitule("S3/D1/P1/DAAG");
        uniteStructurelle63.setCode("S3/D1/P1/DAAG");
        uniteStructurelle63.setUniteStructurellePere(uniteStructurelle51);
        uniteStructurelle63.setType(typeRepository.getOne(6L));
        uniteStructurelleRepository.save(uniteStructurelle63);
        UniteStructurelle uniteStructurelle64=new UniteStructurelle();
        uniteStructurelle64.setIntitule("S1/D2/P1/DAAG");
        uniteStructurelle64.setCode("S1/D2/P1/DAAG");
        uniteStructurelle64.setUniteStructurellePere(uniteStructurelle52);
        uniteStructurelle64.setType(typeRepository.getOne(6L));
        uniteStructurelleRepository.save(uniteStructurelle64);
        UniteStructurelle uniteStructurelle65=new UniteStructurelle();
        uniteStructurelle65.setIntitule("S2/D2/P1/DAAG");
        uniteStructurelle65.setCode("S2/D2/P1/DAAG");
        uniteStructurelle65.setUniteStructurellePere(uniteStructurelle52);
        uniteStructurelle65.setType(typeRepository.getOne(6L));
        uniteStructurelleRepository.save(uniteStructurelle65);
        UniteStructurelle uniteStructurelle66=new UniteStructurelle();
        uniteStructurelle66.setIntitule("S3/D2/P1/DAAG");
        uniteStructurelle66.setCode("S3/D2/P1/DAAG");
        uniteStructurelle66.setUniteStructurellePere(uniteStructurelle52);
        uniteStructurelle66.setType(typeRepository.getOne(6L));
        uniteStructurelleRepository.save(uniteStructurelle66);


    }

    @Override
    public void initAxeStrategique() {
        int numberOfGestionnaires = gestionnaireRepository.findAll().size();
        Long gestSize = Long.valueOf(numberOfGestionnaires);
        uniteStructurelleRepository.findAll().forEach(uniteStructurelle -> {
            for(int i=0;i<2;i++){
                AxeStrategique axeStrategique =new AxeStrategique();
                axeStrategique.setIntitule(lorem.getTitle(8,10));
                axeStrategique.setDescription(lorem.getTitle(20));
                axeStrategique.setUniteStructurelle(uniteStructurelle);
                axeStrategique.setDateDebutPrevisionnel(LocalDate.now().plusMonths(2L));
                axeStrategique.setCreatedByGestionnaire(gestionnaireRepository.getOne(1L +
                        (long) (Math.random() * (gestSize - 1L))));
                axeStrategique.setTauxAvancement(Math.random() * 100);
                axeStrategiqueRepository.save(axeStrategique);
            }
        });
    }

    @Override
    public void initType() {
        Type type1=new Type();
        type1.setNom("Ministre");
        typeRepository.save(type1);
        Type type2=new Type();
        type2.setNom("Secrétariat");
        typeRepository.save(type2);
        Type type3=new Type();
        type3.setNom("Direction");
        typeRepository.save(type3);
        Type type4=new Type();
        type4.setNom("Pole");
        typeRepository.save(type4);
        Type type5=new Type();
        type5.setNom("Division");
        typeRepository.save(type5);
        Type type6=new Type();
        type6.setNom("Service");
        typeRepository.save(type6);
    }

    @Override
    public void initGestionnaire() {
      uniteStructurelleRepository.findAll().forEach(unite -> {
          AdminGestionnaire adminGestionnaire =new AdminGestionnaire();
          adminGestionnaire.setNom(lorem.getLastName());
          adminGestionnaire.setPrenom(lorem.getFirstName());
          adminGestionnaire.setCIN(lorem.getZipCode());
          adminGestionnaire.setUniteStructurelle(unite);
          adminGestionnaire.setTel(lorem.getPhone());
          adminGestionnaire.setEmail(lorem.getEmail());
          adminGestionnaire.setPassword(bCryptPasswordEncoder.encode("1234"));
          adminGestionnaireRepository.save(adminGestionnaire);
         for (int i=0;i<2;i++){
             SimpleGestionnaire simpleGestionnaire =new SimpleGestionnaire();
             simpleGestionnaire.setNom(lorem.getLastName());
             simpleGestionnaire.setPrenom(lorem.getFirstName());
             simpleGestionnaire.setCIN(lorem.getZipCode());
             simpleGestionnaire.setUniteStructurelle(unite);
             simpleGestionnaire.setTel(lorem.getPhone());
             simpleGestionnaire.setActive(true);
             simpleGestionnaire.setEmail(lorem.getEmail());
             simpleGestionnaire.setPassword(bCryptPasswordEncoder.encode("123456"));
             simpleGestionnaireRepository.save(simpleGestionnaire);
         }

      });
    }

    @Override
    public void initEvaluationAxeStrategique() {
        Integer numberOfGestionnaires = gestionnaireRepository.findAll().size();
        Long gestSize = Long.valueOf(numberOfGestionnaires);
           axeStrategiqueRepository.findAll().forEach(axeStrategique -> {
               for (int i = 0; i < 2; i++) {
                   EvaluationAxeStrategique evaluationAxeStrategique = new EvaluationAxeStrategique();
                   evaluationAxeStrategique.setAxeStrategique(axeStrategique);
                   evaluationAxeStrategique.setGestionnaire(gestionnaireRepository
                           .getOne(1L + (long) (Math.random() * (gestSize - 1L))));
                   evaluationAxeStrategique.setDateEvaluation(LocalDate.ofEpochDay(ThreadLocalRandom
                           .current().nextInt(49 * 365, 50 * 365)));
                   evaluationAxeStrategique.setTauxAvancement(Math.random() * 100);
                   evaluationAxeStrategiqueRepository.save(evaluationAxeStrategique);
               }


           });
    }

    @Override
    public void initEvaluationObjectif() {
        Integer numberOfGestionnaires = gestionnaireRepository.findAll().size();
        Long gestSize = Long.valueOf(numberOfGestionnaires);
        objectifRepository.findAll().forEach(objectif -> {
            for (int i = 0; i < 2; i++) {
                EvaluationObjectif evaluationObjectif = new EvaluationObjectif();
                evaluationObjectif.setObjectif(objectif);
                evaluationObjectif.setGestionnaire(gestionnaireRepository
                        .getOne(1L + (long) (Math.random() * (gestSize - 1L))));
                evaluationObjectif.setDateEvaluation(LocalDate.ofEpochDay(ThreadLocalRandom
                        .current().nextInt(49 * 365, 50 * 365)));
                evaluationObjectif.setTauxAvancement(Math.random() * 100);
                evaluationObjectifRepository.save(evaluationObjectif);
            }
        });

    }
    @Override
    public void initEvaluationActionCO(){
        Integer numberOfGestionnaires = gestionnaireRepository.findAll().size();
        Long gestSize = Long.valueOf(numberOfGestionnaires);
        actionCORepository.findAll().forEach(actionCO -> {
            for (int i = 0; i < 2; i++) {
                EvaluationActionCO evaluationActionCO = new EvaluationActionCO();
                evaluationActionCO.setActionCO(actionCO);
                evaluationActionCO.setGestionnaire(gestionnaireRepository
                        .getOne(1L + (long) (Math.random() * (gestSize - 1L))));
                evaluationActionCO.setDateEvaluation(LocalDate.ofEpochDay(ThreadLocalRandom
                        .current().nextInt(49 * 365, 50 * 365)));
                evaluationActionCO.setTauxAvancement(Math.random() * 100);
                evaluationActionCORepository.save(evaluationActionCO);
            }
        });
    }

    @Override
    public  void  initObjectif(){
        Integer numberOfGestionnaires = gestionnaireRepository.findAll().size();
        Long gestSize = Long.valueOf(numberOfGestionnaires);
       axeStrategiqueRepository.findAll().forEach(axeStrategique -> {
           for(int i=0;i<2;i++){
               Objectif objectif=new Objectif();
               objectif.setIntitule(lorem.getTitle(8,10));
               objectif.setDateDebutPrevisionnel(LocalDate.now().plusMonths(3L));
               objectif.setAxeStrategique(axeStrategique);
               objectif.setCreatedByGestionnaire(gestionnaireRepository.getOne(1L +
                       (long) (Math.random() * (gestSize - 1L))));
               objectif.setTauxAvancement(Math.random() * 100);
               objectifRepository.save(objectif);
           }
       });
    }


    @Override
    public  void  initActionCO(){
        Integer numberOfGestionnaires = gestionnaireRepository.findAll().size();
        Long gestSize = Long.valueOf(numberOfGestionnaires);
     objectifRepository.findAll().forEach(objectif -> {
         for(int i=0;i<2;i++){
             ActionCO actionCO =new ActionCO();
             actionCO.setIntitule(lorem.getTitle(12,14));
             actionCO.setObjectif(objectif);
             actionCO.setDateDebutPrevisionnel(LocalDate.now().plusMonths(2L));
             actionCO.setCreatedByGestionnaire(gestionnaireRepository.getOne(1L +
                     (long) (Math.random() * (gestSize - 1L))));
             actionCO.setTauxAvancement(Math.random() * 100);
             actionCORepository.save(actionCO);
         }
     });
    }

    @Override
    public void initModificationAxeStrategique() {
        Integer numberOfGestionnaires = gestionnaireRepository.findAll().size();
        Long gestSize = Long.valueOf(numberOfGestionnaires);
        axeStrategiqueRepository.findAll().forEach(axeStrategique -> {
            for (int i = 0; i < 2; i++) {
                ModificationAxeStrategique modificationAxeStrategique = new ModificationAxeStrategique();
                modificationAxeStrategique.setDateModification(LocalDate.ofEpochDay(ThreadLocalRandom
                        .current().nextInt(49 * 365, 50 * 365)));
                modificationAxeStrategique.setAxeStrategique(axeStrategique);
                modificationAxeStrategique.setGestionnaire(gestionnaireRepository.getOne(1L +
                        (long) (Math.random() * (gestSize - 1L))));
                modificationAxeStrategiqueRepository.save(modificationAxeStrategique);
            }
        });
    }

    @Override
    public void initModificationObjectif() {
        Integer numberOfGestionnaires = gestionnaireRepository.findAll().size();
        Long gestSize = Long.valueOf(numberOfGestionnaires);
        objectifRepository.findAll().forEach(objectif -> {
            for (int i = 0; i < 2; i++) {
                ModificationObjectif modificationObjectif = new ModificationObjectif();
                modificationObjectif.setDateModification(LocalDate.ofEpochDay(ThreadLocalRandom
                        .current().nextInt(49 * 365, 50 * 365)));
                modificationObjectif.setObjectif(objectif);
                modificationObjectif.setGestionnaire(gestionnaireRepository.getOne(1L +
                        (long) (Math.random() * (gestSize - 1L))));
                modificationObjectifRepository.save(modificationObjectif);
            }
        });
    }

    @Override
    public void initModificationActionCO() {
        Integer numberOfGestionnaires = gestionnaireRepository.findAll().size();
        Long gestSize = Long.valueOf(numberOfGestionnaires);
        actionCORepository.findAll().forEach(actionCO -> {
            for (int i = 0; i < 2; i++) {
                ModificationActionCO modificationActionCO = new ModificationActionCO();
                modificationActionCO.setDateModification(LocalDate.ofEpochDay(ThreadLocalRandom
                        .current().nextInt(49 * 365, 50 * 365)));
                modificationActionCO.setActionCO(actionCO);
                modificationActionCO.setGestionnaire(gestionnaireRepository.getOne(1L +
                        (long) (Math.random() * (gestSize - 1L))));
                modificationActionCORepository.save(modificationActionCO);
            }
        });
    }

    @Override
    public void initPartiePrenante() {
        Integer numberOfUnites = uniteStructurelleRepository.findAll().size();
        Long uniteSize = Long.valueOf(numberOfUnites);
        objectifRepository.findAll().forEach(objectif -> {
            for (int i = 0; i < 2; i++) {
                PartiePrenante partiePrenante = new PartiePrenante();
                partiePrenante.setObjectif(objectif);
                partiePrenante.setUniteStructurelle(uniteStructurelleRepository.getOne(1L +
                        (long) (Math.random() * (uniteSize - 1L))));
                partiePrenanteRepository.save(partiePrenante);
            }
        });

    }
    @Override
    public void initEvaluation(){
       adminGestionnaireRepository.findAll().forEach(adminGestionnaire -> {
           Evaluation evaluation=new Evaluation();
           evaluation.setAdminGestionnaire(adminGestionnaire);
           evaluation.setDateCreation(new Date());
           evaluation.setDateLimite(LocalDate.now().plusWeeks(2));
           evaluationRepository.save(evaluation);
       });

    }
}
