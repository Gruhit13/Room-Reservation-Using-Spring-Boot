package com.gruhit.lil.learningspring.utils;

import com.gruhit.lil.learningspring.business.ReservationService;
import com.gruhit.lil.learningspring.business.RoomReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

    private final ReservationService reservationService;
    private final DateUtils dateUtils;

    public AppStartupEvent(ReservationService reservationService, DateUtils dateUtils) {
        this.reservationService = reservationService;
        this.dateUtils = dateUtils;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Date query_date = this.dateUtils.createDateFromDateString("2022-01-01");
        System.out.println("Date Query: " + query_date);

        List<RoomReservation> reservations = this.reservationService.getRoomReservationsForDate(query_date);
        reservations.forEach(System.out::println);
    }
}
