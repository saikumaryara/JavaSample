package com.nt.threads;

import com.nt.blogic.Addition;

public class Ad2 extends Thread {
	private Addition a;

	public Ad2(Addition a) {
		this.a = a;
	}

	@Override
	public void run() {
		a.add(70, 80);
	}
}
