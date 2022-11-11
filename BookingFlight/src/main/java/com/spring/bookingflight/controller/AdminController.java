package com.spring.bookingflight.controller;

import com.spring.bookingflight.bean.Admin;
import com.spring.bookingflight.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    @GetMapping("/id")
    public Optional<Admin> getById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping
    public List<Admin> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Admin create(@RequestBody Admin admin){
        return service.create(admin);
    }

    @PutMapping
    public Admin update(@RequestBody Admin admin ){
        return service.update(admin);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
