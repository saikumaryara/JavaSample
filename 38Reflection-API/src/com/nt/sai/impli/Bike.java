package com.nt.sai.impli;

import com.nt.sai.spec.*;

public class Bike implements Vehicle {
	public Bike() {
        System.out.println("Bike get Instaciated ");
	}

	@Override
	public void start() {
		System.out.println("Bike is started");
	}

	@Override
	public void move() {
		System.out.println("Bike is moving");
	}

	@Override
	public void stop() {
		System.out.println("Bike is stoped");
	}

}