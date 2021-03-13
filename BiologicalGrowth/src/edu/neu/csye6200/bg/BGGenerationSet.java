package edu.neu.csye6200.bg;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @author Deekshitha
 *
 */
public class BGGenerationSet extends Observable {

	private static ArrayList<BGGeneration> bggList;
	private static int genCounter = 1;

	public BGGenerationSet() {
		
		bggList = new ArrayList<BGGeneration>();

		addNewGen();
		
		setChanged();
	
	}

	public static void main(String[] args) {
	
		BGGenerationSet bggs = new BGGenerationSet();
	
	}

	private void addToList(BGGeneration bgg) {
	
		bggList.add(bgg);
	
	}

	public void addNewGen() {
	
		addToList(new BGGeneration(genCounter++));
		
		setChanged();
		
		notifyObservers(new String("A BGGeneration has been added"));
	
	}

	public ArrayList<BGGeneration> getBGGList() {
		return bggList;
	}
}
