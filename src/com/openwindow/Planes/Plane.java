package com.openwindow.Planes;

import com.openwindow.Booking;
import com.openwindow.Destination;

import java.util.ArrayList;

/**
 * Created by sebastian on 15/06/13.
 */
public class Plane {
    //seats
    Integer ecoSeats = 0;
    Integer firstclassSeats = 0;
    Integer privateCabins = 0;

    //cargo
    Integer maxCargo = 0;

    //passengers
    Boolean acceptPassengers = false;

    //destination
    String nextDestination = null;

    //booking list
    public ArrayList<Booking> bookings = new ArrayList<>();

    public Plane(Integer ecoSeats,Integer firstclassSeats, Integer privateCabins, Integer maxCargo, Boolean acceptPassengers, String nextDestination) {
        this.ecoSeats = ecoSeats;
        this.firstclassSeats = firstclassSeats;
        this.privateCabins = privateCabins;
        this.acceptPassengers = acceptPassengers;
        this.nextDestination = nextDestination;
    }

    @Override
    public String toString() {
        return "This plane is going to "+this.nextDestination+"\n";
    }
}
