package com.openwindow;

/**
 * Created by sebastian on 15/06/13.
 */
public class CargoBooking extends Booking {

    Double weight = 0.00;

    public CargoBooking(String passport, Double weight) {
        super(passport);
        this.weight = weight;
    }
}
