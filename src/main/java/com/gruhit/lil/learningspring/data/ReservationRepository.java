package com.gruhit.lil.learningspring.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
//    public Iterable<Reservation> findReservationByReservationDate(Date res_date);
    public Iterable<Reservation> findReservationByReservationDate(Date res_date);
}
