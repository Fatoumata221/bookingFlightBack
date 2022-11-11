package com.spring.bookingflight.service;

import com.spring.bookingflight.bean.Passenger;
import com.spring.bookingflight.repository.PassengerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {
    private final PassengerRepo repo;

    public PassengerService(PassengerRepo repo) {
        this.repo = repo;
    }
    public Optional<Passenger> getById(Long id){
        return repo.findById(id);
    }
    public List<Passenger> getAll(){
        return repo.findAll();
    }
    public Passenger create(Passenger passenger ){
        return repo.save(passenger);
    }
    public Passenger update(Passenger passenger ){
        return repo.save(passenger);
    }
    public void delete(Long id){
        repo.deleteById(id);
    }
}
