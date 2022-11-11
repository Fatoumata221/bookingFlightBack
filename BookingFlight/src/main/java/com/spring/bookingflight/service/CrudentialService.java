package com.spring.bookingflight.service;

import com.spring.bookingflight.bean.Admin;
import com.spring.bookingflight.bean.Crudential;
import com.spring.bookingflight.bean.Passenger;
import com.spring.bookingflight.repository.AdminRepo;
import com.spring.bookingflight.repository.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CrudentialService {

    @Autowired
    private AdminRepo adminRepo;
    @Autowired
    private PassengerRepo passengerRepo;

    //to signIn

    public Object signIn(Crudential crudential) {
     

        if(adminRepo.findByEmailAndPassword(crudential.getEmail(), crudential.getPassWord()) != null){
            return adminRepo.findByEmailAndPassword(crudential.getEmail(), crudential.getPassWord());
        }else{
            return passengerRepo.findByEmailAndPassword(crudential.getEmail(), crudential.getPassWord());
        }
    }

}
