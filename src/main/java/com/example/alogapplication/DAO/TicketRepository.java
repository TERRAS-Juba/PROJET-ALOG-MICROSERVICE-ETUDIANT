package com.example.alogapplication.DAO;

import com.example.alogapplication.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // Mettre à jour le nombre de ticket d'un étudiant
    @Query(value = "SELECT * FROM ticket WHERE id_etudiant=:id",nativeQuery=true)
    List<Ticket> mesTickets(@Param("id") String id);

}