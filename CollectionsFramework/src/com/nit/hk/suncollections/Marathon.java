package com.nit.hk.suncollections;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Vector;

public class Marathon {
     static LinkedHashSet<Object> lhs=new LinkedHashSet<>();
	public static void main(String[] args) {
        float[]arr=new float[5];
        float temp;
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<5;i++) {
        	arr[i]=sc.nextFloat();
        }
		/*
		 * //Sort the array in descending order for (int i = 0; i < arr.length; i++) {
		 * for (int j = i+1; j < arr.length; j++) { if(arr[i] < arr[j]) { temp = arr[i];
		 * arr[i] = arr[j]; arr[j] = temp; } } }
		 */   
        //I want top 3 runners
     for(int i=0;i<3;i++) {
    	 lhs.add(arr[i]);
     }  
        System.out.println(lhs);
	}

}
