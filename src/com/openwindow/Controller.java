package com.openwindow;

import com.openwindow.Planes.CargoPlane;
import com.openwindow.Planes.EconomyPlane;
import com.openwindow.Planes.LuxuryPlane;
import com.openwindow.Planes.Plane;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //Init flights array
        ArrayList<Plane> flights = new ArrayList<Plane>();

        //Create scheduled flights (add them to the array)

        // params: eco seats, first class seats, private cabins, max cargo, accepts passengers, destination
        Plane plane1 = new CargoPlane("Durban");
        Plane plane2 = new EconomyPlane("Durban");
        Plane plane3 = new CargoPlane("Cape Town");
        Plane plane4 = new EconomyPlane("Cape Town");
        Plane plane5 = new LuxuryPlane("Cape Town");

        // all planes to flight schedule
        flights.addAll(Arrays.asList(plane1, plane2, plane3, plane4, plane5));

        //System.out.print(flights);

        //select plane in array of flights
        Plane myFlight = flights.get(1);

        //create a new booking
        Booking myBooking = new SeatBooking("7234523564",2,0,1);

        myFlight.



    }


    //new booking
    public void newBooking() {

    }

}
