package com.spring.bookingflight.service;

import com.spring.bookingflight.bean.Flight;
import com.spring.bookingflight.repository.FlightRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    private final FlightRepo repo;

    public FlightService(FlightRepo repo) {
        this.repo = repo;
    }

    public Optional<Flight> getById(Long id){
        return repo.findById(id);
    }
    public List<Flight> getAll(){
        return repo.findAll();
    }
    public Flight create(Flight flight ){
        return repo.save(flight );
    }
    public Flight  update(Flight flight ){
        return repo.save(flight );
    }
    public void delete(Long id){
        repo.deleteById(id);
    }
}
