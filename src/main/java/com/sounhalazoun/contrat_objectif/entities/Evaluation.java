package com.sounhalazoun.contrat_objectif.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evaluation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String intitule;
    @Temporal( TemporalType.DATE )
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date dateCreation;
    private LocalDate dateLimite;
    @ManyToOne
    private AdminGestionnaire adminGestionnaire;
}
