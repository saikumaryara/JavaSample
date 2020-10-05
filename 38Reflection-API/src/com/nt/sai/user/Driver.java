package com.nt.sai.user;

import com.nt.sai.spec.Vehicle;

public class Driver {
	public Driver() {}
    public void drive(Vehicle obj) {
    	obj.start();
    	obj.move();
    	obj.stop();
	}

}
