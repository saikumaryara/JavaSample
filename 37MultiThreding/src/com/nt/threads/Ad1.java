package com.nt.threads;

import com.nt.blogic.Addition;

public class Ad1 extends Thread {
	private Addition a;

	public Ad1(Addition a) {
		this.a = a;
	}

	@Override
	public void run() {
		a.add(50, 60);
	}
}
