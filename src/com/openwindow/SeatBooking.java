package com.openwindow;

/**
 * Created by sebastian on 15/06/13.
 */
public class SeatBooking extends Booking {

    Integer ecoSeats = 0;
    Integer firstclassSeats = 0;
    Integer privateCabins = 0;

    public SeatBooking(String passport, Integer ecoSeats, Integer firstclassSeats, Integer privateCabins) {
        super(passport);
        this.ecoSeats = ecoSeats;
        this.firstclassSeats = firstclassSeats;
        this.privateCabins = privateCabins;
    }
}
