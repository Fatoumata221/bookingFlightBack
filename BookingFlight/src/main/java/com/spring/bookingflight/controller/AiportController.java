package com.spring.bookingflight.controller;

import com.spring.bookingflight.bean.Airport;
import com.spring.bookingflight.service.AirportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/airport")
public class AiportController {
    private final AirportService service;

    public AiportController(AirportService service) {
        this.service = service;
    }
    @GetMapping("/id")
    public Optional<Airport>getById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping
    public List<Airport>getAll(){
        return service.getAll();
    }

    @PostMapping
    public Airport create(@RequestBody Airport airport){
        return service.create(airport);
    }

    @PutMapping
    public Airport update(@RequestBody Airport airport ){
        return service.update(airport);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
