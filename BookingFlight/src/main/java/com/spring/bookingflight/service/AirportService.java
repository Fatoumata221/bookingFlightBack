package com.spring.bookingflight.service;

import com.spring.bookingflight.bean.Airport;
import com.spring.bookingflight.repository.AirportRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirportService {
    public final AirportRepo repo;

    public AirportService(AirportRepo repo) {
        this.repo = repo;
    }
    public Optional<Airport>getById(Long id){
        return repo.findById(id);
    }
    public List<Airport> getAll(){
        return repo.findAll();
    }
    public Airport create(Airport airport){
        return repo.save(airport);
    }
    public Airport update(Airport airport){

        return repo.save(airport);
    }
    public void delete(Long id){
        repo.deleteById(id);
    }
}
