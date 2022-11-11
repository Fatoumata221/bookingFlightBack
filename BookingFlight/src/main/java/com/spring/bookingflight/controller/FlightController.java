package com.spring.bookingflight.controller;


import com.spring.bookingflight.bean.Flight;
import com.spring.bookingflight.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flight")
@CrossOrigin("*")
public class FlightController {
    private final FlightService service;

    public FlightController(FlightService service) {
        this.service = service;
    }
    @GetMapping("/{id}")
    public Optional<Flight> getById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping
    public List<Flight> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Flight create(@RequestBody Flight flight){
        return service.create(flight);
    }

    @PutMapping
    public Flight update(@RequestBody Flight flight){
        return service.update(flight);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
