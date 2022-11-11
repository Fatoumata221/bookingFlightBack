package com.spring.bookingflight.service;

import com.spring.bookingflight.bean.Ticket;
import com.spring.bookingflight.dto.TicketDto;
import com.spring.bookingflight.repository.TicketRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {
    private final TicketRepo repo;
    private final ModelMapper mapper;

    public TicketService(TicketRepo repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }
    public Optional<Ticket> getById(Long id){
        return repo.findById(id);
    }
    public List<Ticket> getAll(){
        return repo.findAll();
    }

    public TicketDto create(TicketDto dto){
      Ticket ticket= mapper.map(dto , Ticket.class);
     ticket= repo.save(ticket);
        TicketDto ticketDTO = mapper.map(ticket ,TicketDto.class);
        return ticketDTO;
    }
    public Ticket update(TicketDto dto){
     Ticket ticket = mapper.map(dto , Ticket.class);
        return repo.save(ticket);

    }
    public void delete(Long id){
        repo.deleteById(id);
    }
}
