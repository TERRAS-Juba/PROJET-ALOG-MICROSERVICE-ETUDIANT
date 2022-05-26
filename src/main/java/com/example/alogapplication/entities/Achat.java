package com.example.alogapplication.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Achat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int petitDej;
    private int repas;
    private Date date;
    private String fournisseur;
    @JsonBackReference
    @ManyToOne
    @JoinColumn
    private Etudiant etudiant;
}
