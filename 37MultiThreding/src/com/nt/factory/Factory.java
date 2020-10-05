package com.nt.factory;

public class Factory {
	private int items;
	private boolean itemsFactory;

 synchronized void produce(int items) {
		this.items = this.items + items;
		this.itemsFactory = true;
		System.out.println("Items produced " + items);
		try {
			wait(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}

synchronized void consume(int items) throws InterruptedException {
	    //Thread.sleep(1000);
	    
		this.items = this.items - items;
		this.itemsFactory = false;
		System.out.println("Items consumed " + items);
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notifyAll();
	}
}
