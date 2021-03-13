package edu.neu.csye6200.bg;
import java.util.ArrayList;

public class Test {
	
	private Stem root;
	private BGRule bgr;
	private ArrayList<BGGeneration> BGGenerationList = null;
	private BGGenerationSet bggs;
	private int maxNumGen;

	public Test() {
		
		maxNumGen = 5;

		// Maximum number of generations (taken from user input from CUI)

		bggs = new BGGenerationSet();
		
		BGGenerationList = bggs.getBGGList();
		
		for (int i = 1; i < maxNumGen; i++) {
			bggs.addNewGen();
		}
	}

	public void run() {
		root = BGGenerationList.get(4).getBGGRoot();
		System.out.println("Test class running");
		print(root);
	}

	public void print(Stem node) {
		if (node.getChildStemList().isEmpty()) {
			
			System.out.println(node + " tester x");
		
		} else {
		
			System.out.println(node + " tester y");
			
			for (Stem s : node.getChildStemList()) {
				print(s);
			}
		}
	}

	public static void main(String[] args) {
		
		Test test = new Test();
		
		test.run();
	
	}
}
