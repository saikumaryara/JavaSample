package com.nit.hk.suncollections;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Test02_ArrayList {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
         ArrayList<Object> al1=new ArrayList<>(5);
      //   System.out.println("a1 capacity :"+al1.capacity());
         Class cls=al1.getClass();
         Field elementDataField=cls.getDeclaredField("elementData");
         elementDataField.setAccessible(true);//for accesing private var
         Object[] elementData=(Object[])elementDataField.get(al1);
	
         System.out.println("al1 capacity :"+elementData.length);
         System.out.println("al1 size : "+al1.size());
         System.out.println("al1 eles :"+al1);
         System.out.println();
         al1.add("a");
         al1.add("b");
         elementData=(Object[])elementDataField.get(al1);
         System.out.println("al1 size : "+al1.size());
         System.out.println("al1 eles :"+al1);
         System.out.println("al1 capacity :"+elementData.length);
         System.out.println();
        
         al1.add(5);
         al1.add(6.7);
         al1.add('p');
         al1.add(true);
         al1.add("a");
         al1.add(5);
         al1.add(null);
         al1.add(null);
         al1.add(new A(5,6));
         
         elementData=(Object[])elementDataField.get(al1);
         System.out.println("al1 capacity :"+elementData.length);
         System.out.println("al1 size : "+al1.size());
         System.out.println("al1 eles :"+al1);
         System.out.println();
         System.out.println(10<<1);
         System.out.println(10>>1);

         System.out.println("Rondom access 3rd index object :"+al1.get(3));
         System.out.println();
         for(int i=0;i<al1.size();i++) {
        	 System.out.println("Sequential access "+(i)+" index object :"+al1.get(i));
         }
         System.out.println();
         System.out.println("a1 eles :"+al1);
         System.out.println("Searching for String obj a :"+al1.contains("a"));
         System.out.println("Removing String obj a :"+al1.remove("a"));
         System.out.println("al1 eles :"+al1);
         System.out.println();
         System.out.println("Searching for String obj a :"+al1.contains(new A(5,6)));
         System.out.println("Removing String obj a :"+al1.remove(new A(5,6)));
         System.out.println("al1 eles :"+al1);
         System.out.println();
         System.out.println("al1 capacity :"+elementData.length);
         System.out.println("al1 size : "+al1.size());
         System.out.println("al1 eles :"+al1);
         System.out.println();
         
         ArrayList<Object> al2=new ArrayList<>(al1);
        
         elementData=(Object[])elementDataField.get(al2);
         
         System.out.println("al2 capacity :"+elementData.length);
         System.out.println("al2 size : "+al2.size());
         System.out.println("al2 eles :"+al2);
         System.out.println();
         
        // ArrayList<Object> al3=new ArrayList<Object>(0);  increment by 1
        // ArrayList<Object> al3=new ArrayList<Object>(1); increment by 1
        // ArrayList<Object> al3=new ArrayList<Object>(2); //increment by /2
        // ArrayList<Object> al3=new ArrayList<Object>(3); //increment by /2
         ArrayList<Object> al3=new ArrayList<Object>(4); //increment by /2


         elementData=(Object[])elementDataField.get(al3);
         
         System.out.println("al3 capacity :"+elementData.length);
         System.out.println("al3 size : "+al3.size());
         System.out.println("al3 eles :"+al3);
         System.out.println();
         
         al3.add("a");
         al3.add("a");
         al3.add("a");
         al3.add("a");
         al3.add("a");

         elementData=(Object[])elementDataField.get(al3);

         System.out.println("al3 capacity :"+elementData.length);
         System.out.println("al3 size : "+al3.size());
         System.out.println("al3 eles :"+al3);
         System.out.println();
         
         ArrayList<Object> al4=new ArrayList<Object>(10); 

         elementData=(Object[])elementDataField.get(al4);

         System.out.println("al4 capacity :"+elementData.length);
         System.out.println("al4 size : "+al4.size());
         System.out.println("al4 eles :"+al4);
         System.out.println();
         
         al4.add("a");
         al4.add("b");
         elementData=(Object[])elementDataField.get(al4);

         System.out.println("al4 capacity :"+elementData.length);
         System.out.println("al4 size : "+al4.size());
         System.out.println("al4 eles :"+al4);
         System.out.println();
         
         al4.ensureCapacity(7);    //max(fC,eC);
         al4.ensureCapacity(12);    //max(fC,eC);  
         al4.ensureCapacity(25);    //max(fC,eC);
         

         elementData=(Object[])elementDataField.get(al4);

         System.out.println("al4 capacity :"+elementData.length);
         System.out.println("al4 size : "+al4.size());
         System.out.println("al4 eles :"+al4);
         System.out.println();
         
         al4.trimToSize();
         
         elementData=(Object[])elementDataField.get(al4);

         System.out.println("al4 capacity :"+elementData.length);
         System.out.println("al4 size : "+al4.size());
         System.out.println("al4 eles :"+al4);
         System.out.println();
         
         ArrayList<String> alr=new ArrayList<String>();
         alr.add("HK");
         alr.add("BK");
         
         for(Object obj : alr) {
	      System.out.println(obj);
         }
	}

}
