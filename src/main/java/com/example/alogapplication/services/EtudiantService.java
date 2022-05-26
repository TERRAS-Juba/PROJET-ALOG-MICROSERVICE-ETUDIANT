package com.example.alogapplication.services;

import com.example.alogapplication.DAO.EtudiantRepository;
import com.example.alogapplication.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

public interface EtudiantService {
    Etudiant findEtudiantByEmail(String email);
}

@Service
@Transactional
class EtudiantServiceImpl implements EtudiantService{
    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public Etudiant findEtudiantByEmail(String email) {
        var etudiant=etudiantRepository.findByEmail(email);
        return etudiant;
    }
}
