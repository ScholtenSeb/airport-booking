package com.openwindow;

import java.util.ArrayList;

public interface Plane {

    //seats
    Integer ecoSeats = 0;
    Integer firstclassSeats = 0;
    Integer privateCabins = 0;

    //cargo
    Integer maxCargo = 0;

    //passengers
    Boolean acceptsPassengers = true;

    //destination
    Destination nextDestination = null;

    //booking list
    ArrayList<Booking> bookings = new ArrayList<>();

}
