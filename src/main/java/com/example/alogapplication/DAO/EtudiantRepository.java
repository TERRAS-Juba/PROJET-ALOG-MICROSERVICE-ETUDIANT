package com.example.alogapplication.DAO;

import com.example.alogapplication.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

    @Query(value = "SELECT * FROM etudiant WHERE email=:email", nativeQuery=true)
    Etudiant findByEmail(@Param("email") String email);;
}
