package edu.neu.csye6200.bg;

import java.util.ArrayList;

public class BGRule {
	
	static Stem node; //single instance of the stem
	
	private double gradient; //  direction of growth

	public BGRule(Stem node) {
		this.node = node;
	}

	public void grow() {
		
		if (!node.getChildStemList().isEmpty())
			
			grow(node.getChildStemList(), node);
		    
		    grow(node);
	}

	public void grow(Stem node) {
		
		double length = node.getLength() + 1;
		
		node.setLength(length);

		// Only add children if the stem doesn't have any
		
		if (node.getChildStemList().isEmpty()) {

			node.addChild(new Stem(node.getX() + node.getLength() * Math.cos(node.getdirection()),
				  node.getY() + node.getLength() * Math.sin(node.getdirection()), 2, node.getdirection() + 0.350));//Here i am adding Left  child stem
																														
			node.addChild(new Stem(node.getX() + node.getLength() * Math.cos(node.getdirection()),
				  node.getY() + node.getLength() * Math.sin(node.getdirection()), 3, node.getdirection())); ////Here i am adding Middle child stem
																												
			node.addChild(new Stem(node.getX() + node.getLength() * Math.cos(node.getdirection()),
				  node.getY() + node.getLength() * Math.sin(node.getdirection()), 2, node.getdirection() - 0.350)); ////Here i am adding Right child stem
																														
		}
	}

	/*
	 * This method accepts an ArrayList of Stem as input and recursively grow  
	 * the stems and their children. The youngest generation of stems will get three
	 * children each.
	 */
	public void grow(ArrayList<Stem> stemList, Stem parent) {
		for (Stem s : stemList) {

			// Recalculate stem position every time the parent of stem grows.

			s.setX(parent.getX() + parent.getLength() * Math.cos(parent.getdirection()));
			
			s.setY(parent.getY() + parent.getLength() * Math.sin(parent.getdirection()));

			if (s.getdirection() > 1.58) {
				
				double temp = s.getdirection();
				
				s.setdirection(temp + 0.0875);
			
			} else if (s.getdirection() < 1.56) {
				
				double temp = s.getdirection();
				
				s.setdirection(temp - 0.0875);
			}

			// Recursive method call to grow each stem's children and their own children and so forth and so on
		
			if (!s.getChildStemList().isEmpty())
			
				grow(s.getChildStemList(), s);

			// Grow stem increase stem's length by 1
			
			grow(s);
			
		}
	}
}
