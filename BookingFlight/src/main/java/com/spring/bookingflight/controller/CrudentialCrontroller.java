package com.spring.bookingflight.controller;

import com.spring.bookingflight.bean.Crudential;
import com.spring.bookingflight.service.CrudentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CrudentialCrontroller {

    @Autowired
    private CrudentialService crudentialService;

    //to sign in
    @PostMapping(path = "/signIn")
    public ResponseEntity<Object> signIn(@RequestBody Crudential crudential){
        return ResponseEntity.ok(crudentialService.signIn(crudential));
    }
}
