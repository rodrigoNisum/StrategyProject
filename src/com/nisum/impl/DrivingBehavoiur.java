package com.nisum.impl;

import com.nisum.interfaces.GoBehaviour;

public class DrivingBehavoiur implements GoBehaviour {

    @Override
    public void go() {
        System.out.println("Driving between 0-100 km(h");
    }
}
