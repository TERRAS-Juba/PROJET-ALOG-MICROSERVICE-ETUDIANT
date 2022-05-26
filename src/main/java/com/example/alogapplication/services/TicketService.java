package com.example.alogapplication.services;

import com.example.alogapplication.DAO.TicketRepository;
import com.example.alogapplication.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface TicketService {
    List<Ticket> MesTickets(String id);
}

@Service
@Transactional
class TicketServiceImpl implements TicketService{
    @Autowired
    private TicketRepository ticketRepository;
    @Override
    public List<Ticket> MesTickets(String id) {
        var tickets = (List<Ticket>) ticketRepository.mesTickets(id);
        return tickets;
    }
}
