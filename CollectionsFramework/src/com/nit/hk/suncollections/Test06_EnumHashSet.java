package com.nit.hk.suncollections;

import java.util.EnumSet;

public class Test06_EnumHashSet {

	public static void main(String[] args) {

		EnumSet<Color> enumset=EnumSet.noneOf(Color.class);
		System.out.println(enumset.size());
		System.out.println(enumset);
		
		System.out.println();
		
		enumset.add(Color.PINK);
		enumset.add(Color.BLACK);
		enumset.add(Color.CYAN);
		//enumset.add(null);

		System.out.println(enumset.size());
		System.out.println(enumset);
        System.out.println();
        
        EnumSet<Color> enumset2=EnumSet.allOf(Color.class);
        System.out.println(enumset2.size());
        System.out.println(enumset2);
        System.out.println();
        
        
        EnumSet<Color> enumset3=EnumSet.of(Color.RED,Color.BLUE);
        System.out.println(enumset3.size());
        System.out.println(enumset3);
        System.out.println();  
        
        enumset3.add(Color.GREEN);
        enumset3.add(Color.VOILET);
        enumset3.add(Color.WHITE);
        
        System.out.println(enumset3.size());
        System.out.println(enumset3);
        System.out.println();  
        
        EnumSet<Color> enumset4=EnumSet.complementOf(enumset3);
        System.out.println(enumset4.size());
        System.out.println(enumset4);
        System.out.println();  
        
        
		
	}

}
