package com.spring.bookingflight.service;

import com.spring.bookingflight.bean.Reservation;
import com.spring.bookingflight.dto.ReservationDto;
import com.spring.bookingflight.repository.ReservationRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ReservationService {
    private final ModelMapper mapper;
   private final ReservationRepo repo;

    public ReservationService(ModelMapper mapper, ReservationRepo repo) {
        this.mapper = mapper;
        this.repo = repo;
    }
    public Optional<Reservation> getById(Long id){
        return repo.findById(id);
    }
    public List<Reservation> getAll(){
        return repo.findAll();
    }

    public Reservation create(Reservation reservation){
        /**
         * 1. copier les infos du dto vers le model
         * 2. recuperer le passager en fonction de l'id du dto (passengerId)
         * 3. ajouter le passager au model
         * 4. save
         */
        reservation.setReservationDate(LocalDate.now());
        reservation.setDepartureTime(LocalTime.now());
        System.out.println(reservation.getReservationDate());
        System.out.println(reservation.getDepartureTime());
        /*Reservation reservation = mapper.map(dto , Reservation.class);
        reservation = repo.save(reservation);
        ReservationDto reservationDTO = mapper.map(reservation, ReservationDto.class);*/
        return repo.save(reservation);
    }
    public Reservation update(Reservation dto){
        Reservation reservation = mapper.map(dto , Reservation.class);
        return repo.save(reservation);
    }
    public void delete(Long id){
        repo.deleteById(id);
    }
}
