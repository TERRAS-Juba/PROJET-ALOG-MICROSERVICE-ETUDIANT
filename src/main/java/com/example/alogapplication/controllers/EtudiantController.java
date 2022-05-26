package com.example.alogapplication.controllers;

import com.example.alogapplication.entities.Etudiant;
import com.example.alogapplication.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:2000")
@RestController
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;
    @GetMapping("etudiants/etudiant/{email}")
    public ResponseEntity<Etudiant> getEtudiantByEmail(@PathVariable String email){
        return new ResponseEntity<Etudiant>(etudiantService.findEtudiantByEmail(email),
                HttpStatus.OK);
    }
}

