package com.nisum.impl;

import com.nisum.interfaces.GoBehaviour;

public class DrivingFastBehavoiur implements GoBehaviour{
    @Override
    public void go() {
        System.out.println("Driving between 0-250 km/h");
    }
}
