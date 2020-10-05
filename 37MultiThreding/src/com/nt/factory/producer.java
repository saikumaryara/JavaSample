package com.nt.factory;

public class producer extends Thread {
	private Factory f;

	producer(Factory f) {
		this.f = f;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
				f.produce(i);
		}
	}

}
