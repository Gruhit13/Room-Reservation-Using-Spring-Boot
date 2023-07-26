package com.gruhit.lil.learningspring.business;

import com.gruhit.lil.learningspring.data.Guest;
import com.gruhit.lil.learningspring.data.GuestRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuestService {
    private final GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public List<Guest> getAllGuests(){
        Iterable<Guest> guests = this.guestRepository.findAll();
        List<Guest> guestsList = new ArrayList<>();
        for(Guest guest: guests){
            guestsList.add(guest);
        }
        return guestsList;
    }
}
