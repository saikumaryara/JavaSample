package edu.neu.csye6200.bg;

/**
 * @author Deekshitha 
 * This class holds a generation of tree of stems
 */
public class BGGeneration {

	int gen;// Signifies the Nth generation
	Stem root;

	// Default Constructor
	public BGGeneration(int count) {
		gen = count;
		root = new Stem(0, 0, 5, 0.5 * Math.PI); // the root stem
		BGRule bgr = new BGRule(root);

		// grow stem until Nth generation
		for (int i = 1; i < gen; i++) {
			bgr.grow();
		}
	}

	/*
	 * This method returns the root stem that also contains all the children stems
	 * until the Nth generation
	 */
	public Stem getBGGRoot() {
		return root;
	}
}
