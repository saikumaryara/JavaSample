package com.nt.sai.impli;

import com.nt.sai.spec.*;

public class Bus implements Vehicle {
	public Bus() {
        System.out.println("Bus get Instaciated ");
	}

	@Override
	public void start() {
		System.out.println("Bus is started");
	}

	@Override
	public void move() {
		System.out.println("Bus is moving");
	}

	@Override
	public void stop() {
		System.out.println("Bus is stoped");
	}

}