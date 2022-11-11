package com.spring.bookingflight.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="admins")
@Data
@AllArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminId;

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    @Column(unique = true )
    private String email;
    private  String role ="ROLE_ADMIN";

    public Admin() {
    }
}
