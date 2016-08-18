package com.nisum.impl;

import com.nisum.interfaces.GoBehaviour;

public class FlyingBehavoiur implements GoBehaviour {
    @Override
    public void go() {
        System.out.println("Flying between 0-200 km/H");
    }
}
