import java.lang.*;
class Person{
	int pnum;
	Person(int pnum){
		this.pnum=pnum;
	}
	Person(){
	}

	public int getPnum(){
	return pnum;
	}
	public void setPnum(int pnum){
		this.pnum=pnum;
	}
    
}
class Student extends Person{
  
}
class Employee extends Person{

}
class Custom_Collection1{
	private Object[] objArray=new Object[2];//super class Object[] created with initial Capacity 2
   private int elementCount=0;

   public void add(Object obj){//Object type parameter allows any type of values/objs
	   if(elementCount==objArray.length){
		    System.out.println(" incrementCapacity called ");
	         incrementCapacity();
	   }
	   System.out.println(" add method "+elementCount);
	   objArray[elementCount]=obj;
		elementCount++;
   }//add()

   public void incrementCapacity(){
	   int newCapacity=objArray.length*2;//here i am inreasing initial capacity to double
	   Object[] nextArray=new Object[newCapacity];
	   for(int i=0;i<objArray.length;i++){
	   nextArray[i]=objArray[i];
	   }
	     System.out.println(" incrementCapacity before "+objArray.length);
	   objArray=nextArray;//newArray var_ referensing to old array var_
	     System.out.println(" incrementCapacity after "+objArray.length);

		
	}

   public void display(){
		for(int i=0;i< objArray.length;i++){
		Person p2= (Person) objArray[i];
		if(p2!=null){
			 System.out.println( i+" index "+p2.getPnum());
		}else{
		System.out.println( i+" index  null");
		}
		
		}
	}
    

}
public class Custom_Collection_Main01{
	public static void main(String[] args){
     Custom_Collection1 col1=new Custom_Collection1();
	Person p1= new Person();
	p1.setPnum(12);
	col1.add(p1);
	col1.add(new Person(23));
	col1.add(new Person(43));
	col1.add(new Person(73));
	col1.add(new Person(53));
	col1.add(new Person(83));

	col1.display();
	}
}