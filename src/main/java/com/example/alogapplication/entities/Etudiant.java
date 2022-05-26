package com.example.alogapplication.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String numeroEtud;
    private String prenom;
    private String nom;
    private String sexe;
    private Date dateNaissance;
    private String niveau;
    private String filiere;
    @Column(unique = true)
    private String telephone;
    @Column(unique = true)
    private String email;
    @JsonManagedReference
    @OneToMany(mappedBy="etudiant")
    private Collection<Ticket> tickets;
    @JsonManagedReference
    @OneToMany(mappedBy="etudiant")
    private Collection<Depense> depenses;
    @JsonManagedReference
    @OneToMany(mappedBy="etudiant")
    private Collection<Achat> achats;
}