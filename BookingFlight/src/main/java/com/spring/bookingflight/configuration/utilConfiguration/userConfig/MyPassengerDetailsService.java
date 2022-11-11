package com.spring.bookingflight.configuration.utilConfiguration.userConfig;
import com.spring.bookingflight.bean.Passenger;
import com.spring.bookingflight.repository.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyPassengerDetailsService implements UserDetailsService {

    @Autowired
    private PassengerRepo passengerRepo;

    @Override
    public MyPassengerDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Passenger passenger = passengerRepo.getPassengerByEmail(email);
        if(passenger != null) {
            return new MyPassengerDetails(passenger);
        }else {
            throw new UsernameNotFoundException("Could not find user");
        }
    }
}
