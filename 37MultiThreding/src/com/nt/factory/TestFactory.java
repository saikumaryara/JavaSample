package com.nt.factory;

public class TestFactory {

	public static void main(String[] args) {
		Factory factory = new Factory();
		producer p1 = new producer(factory);
		consumer c1 = new consumer(factory);
		p1.start();
		c1.start(); 
	}
}