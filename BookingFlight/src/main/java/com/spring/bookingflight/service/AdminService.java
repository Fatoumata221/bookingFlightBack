package com.spring.bookingflight.service;

import com.spring.bookingflight.bean.Admin;
import com.spring.bookingflight.repository.AdminRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    private final AdminRepo repo;

    public AdminService(AdminRepo repo) {
        this.repo = repo;
    }
    public Optional<Admin> getById(Long id){
        return repo.findById(id);
    }
    public List<Admin> getAll(){
        return repo.findAll();
    }
    public Admin create(Admin admin){
        return repo.save(admin);
    }
    public Admin update(Admin admin){
        return repo.save(admin);
    }
    public void delete(Long id){
        repo.deleteById(id);
    }
}
