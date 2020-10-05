package com.nt.blogic;

public class Addition {
	private int x, y;

	synchronized public void add(int x, int y) {
		this.x = x;
		this.y = y;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		int result = this.x + this.y;
		System.out.println(Thread.currentThread().getName() + " Result:" + result);
	}
}
