package edu.neu.csye6200.agency;
import java.io.Serializable;

public class Vehicle implements Serializable,Comparable<Vehicle>{

	private static final long serialVersionUID = 1L;
	String make;

	String model;
	int modelyear;
	double range;
	int fuelCap;
	double distance;
	double kpl;
	String licence;

	public String getLicence() {
		return licence;
	}

	public Vehicle(String make, String model, int modelyear, double kpl, String licence) {
		this.make = make;
		this.model = model;
		this.modelyear = modelyear;
		this.kpl = kpl;
		this.licence = licence;

	}

	{
		fuelCap = 9;
	}

	public double Range() {
		range = fuelCap * kpl;
		return range;
	}
	@Override
	public String toString() {
		return "[" + (make != null ? "make=" + make + ", " : "")
				+ (model != null ? "model=" + model + ", " : "") + "modelyear=" + modelyear + ", range=" + range
				+ ", fuelCap=" + fuelCap + ", distance=" + distance + ", kpl=" + kpl + ", "
				+ (licence != null ? "licence=" + licence : "") + "]";
	}

	public void display() {
		System.out.println(this.make + "\t\t" + this.model + "\t\t " + this.modelyear + "\t\t" + this.Range() + "\t"
				+ this.licence);
	}

	@Override
	public int compareTo(Vehicle v) {
		return this.getLicence().compareTo(v.getLicence());
	}

}
