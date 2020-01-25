package com.sounhalazoun.contrat_objectif.controller;

import com.sounhalazoun.contrat_objectif.dao.UniteStructurelleRepository;
import com.sounhalazoun.contrat_objectif.entities.UniteStructurelle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContratObjectifsController {
    @Autowired
    UniteStructurelleRepository uniteStructurelleRepository;

    @GetMapping("/subUnites/{id}")
    public  List<UniteStructurelle> findSubUnites(@PathVariable Long id) {
          return uniteStructurelleRepository.findUniteStructurellesByUniteStructurellePere(uniteStructurelleRepository.getOne(id));
    }
}
