package edu.neu.csye6200.bg;

import java.util.ArrayList;

/**
 * @author Deekshitha
 */
public class Stem {
	private static int idCount = 0; //ID counter for all stem instances
	
	private int id; //Unique ID for each stem instance.
	private double X, Y, length, direction; // X, Y are the co-ordinates of stem, length and direction of the stem
	private ArrayList<Stem> childStemList; //list of child Stem instances
	
	public Stem(double X, double Y, double length, double direction) {
		id = idCount++;
		this.X = X;
		this.Y = Y;
		this.direction = direction;     //direction in radians
		this.length = length;           //length in feet
		childStemList = new ArrayList<Stem>();
	}
	
	//Add child stems to the stem instance
	
	public void addChild(Stem child) {
		childStemList.add(child);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getX() {
		return X;
	}

	public void setX(double x) {
		X = x;
	}

	public double getY() {
		return Y;
	}

	public void setY(double y) {
		Y = y;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getdirection() {
		return direction;
	}

	public void setdirection(double direction) {
		this.direction = direction;
	}

	public ArrayList<Stem> getChildStemList() {
		return childStemList;
	}
	
	public String toString() {
		
		return String.format("ID: %5$01d Location: %1$5.2f, %2$5.2f ; Length: %3$5.2f cm ; Direction %4$5.2f radians",X,Y,length,direction,id);

	}
	
	public void printChildren() {
		
		if(!childStemList.isEmpty()) {
			
			for(Stem s : childStemList) {
				
				System.out.println(s.toString());
			}
		}
	}
	
}
