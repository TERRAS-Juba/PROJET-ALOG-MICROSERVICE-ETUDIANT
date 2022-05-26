package com.example.alogapplication.controllers;

import com.example.alogapplication.entities.Ticket;
import com.example.alogapplication.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:2000")
@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    // Voir le nombre de tickets d'un etudiant par son id
    @GetMapping("tickets/etudiant/{id}")
    public ResponseEntity<List<Ticket>> getTicketByIdEtudiant(@PathVariable
                                                                      String id){
        return new ResponseEntity<>(ticketService.MesTickets(id),
                HttpStatus.OK);
    }
}
