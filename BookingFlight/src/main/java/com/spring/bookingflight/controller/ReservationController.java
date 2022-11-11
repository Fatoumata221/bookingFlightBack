package com.spring.bookingflight.controller;

import com.spring.bookingflight.bean.Reservation;
import com.spring.bookingflight.service.ReservationService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservation")
@CrossOrigin("*")
public class ReservationController {
    private final ReservationService service;
    private final ModelMapper mapper;

    public ReservationController(ReservationService service, ModelMapper maper) {
        this.service = service;
        this.mapper = maper;
    }
    @GetMapping("/{id}")
    public Optional<Reservation> getById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping
    public List<Reservation> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Reservation create(@RequestBody Reservation reservation){
        System.out.println(reservation.getDepartureTime()+"dto departure time recupere");
        System.out.println(reservation.getReservationDate()+"dto reservation recupere ");
        return service.create(reservation);
    }
    @PutMapping
    public Reservation update(@RequestBody Reservation reservation){
        return service.update(reservation);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
