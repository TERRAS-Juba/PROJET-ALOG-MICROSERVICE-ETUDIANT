package com.example.alogapplication.DAO;

import com.example.alogapplication.entities.Achat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AchatRepository extends JpaRepository<Achat, Long> {
    @Query(value = "SELECT id, date, petit_dej, repas, etudiant_id,fournisseur FROM achat WHERE etudiant_id=:etudiantId ORDER BY date DESC LIMIT 5", nativeQuery = true)
    List<Achat> findAchatByEtudiant(@Param("etudiantId") Long etudiantId);
}
