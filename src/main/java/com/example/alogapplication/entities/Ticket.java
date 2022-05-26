package com.example.alogapplication.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ticket {
    @Id
    private Long id;
    private int petitDej;
    private int repas;
    @JsonBackReference
    @ManyToOne
    @JoinColumn
    private Etudiant etudiant;
}
