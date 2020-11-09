package com.nit.hk.suncollections;

public class A {
	private int x;
	private int y;

	public A(int x,int y) {
        this.x=x;
        this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	@Override
	public int hashCode() {
		return x+y;
	}
	@Override
	public  boolean equals(Object obj) {
		if(obj instanceof A) {
			A a=(A)obj;
			return this.x==a.x && this.y==a.y;
		}
		return false;
	}
	@Override
	public String toString() {
		return "A(" + x + " , "+ y +")";
	}
}
