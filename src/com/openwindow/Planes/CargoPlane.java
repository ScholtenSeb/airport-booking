package com.openwindow.Planes;

import com.openwindow.Destination;

/**
 * Created by sebastian on 15/06/13.
 */
public class CargoPlane extends Plane {

    public CargoPlane(String nextDestination) {
        super(0, 0, 0, 1000, false, nextDestination);
    }
}
