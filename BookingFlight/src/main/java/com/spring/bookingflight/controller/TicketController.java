package com.spring.bookingflight.controller;

import com.spring.bookingflight.bean.Ticket;
import com.spring.bookingflight.dto.TicketDto;
import com.spring.bookingflight.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    private final TicketService service;
    private final ModelMapper mapper;

    public TicketController(TicketService service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    @GetMapping("/id")
    public Optional<Ticket> getById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping
    public List<Ticket> getAll(){
        return service.getAll();
    }

    @PostMapping
    public TicketDto create(@RequestBody TicketDto ticket){
        return service.create(ticket);
    }

    @PutMapping
    public Ticket update(@RequestBody TicketDto ticket){
        return service.update(ticket);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
