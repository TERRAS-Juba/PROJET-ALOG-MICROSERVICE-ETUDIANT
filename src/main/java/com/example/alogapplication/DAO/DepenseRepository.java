package com.example.alogapplication.DAO;

import com.example.alogapplication.entities.Depense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepenseRepository extends JpaRepository<Depense, Long> {

    @Query(value = "SELECT id, date, nombre, type, etudiant_id FROM depense WHERE etudiant_id=:etudiantId ORDER BY date DESC LIMIT 5", nativeQuery = true)
    List<Depense> findDepensesByEtudiant(@Param("etudiantId") Long etudiantId);
}
