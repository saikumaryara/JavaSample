package com.nt.factory;

public class consumer extends Thread {
	private Factory f;

	consumer(Factory f) {
		this.f = f;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				f.consume(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
