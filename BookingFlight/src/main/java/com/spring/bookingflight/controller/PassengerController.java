package com.spring.bookingflight.controller;

import com.spring.bookingflight.bean.Passenger;
import com.spring.bookingflight.service.PassengerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/passenger")
@CrossOrigin("*")
public class PassengerController {
    private final PassengerService service;


    public PassengerController(PassengerService service) {
        this.service = service;
    }
    @GetMapping("/id")
    public Optional<Passenger> getById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping
    public List<Passenger> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Passenger create(@RequestBody Passenger passenger){
        return service.create(passenger);
    }

    @PutMapping
    public Passenger update(@RequestBody Passenger passenger){
        return service.update(passenger);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
