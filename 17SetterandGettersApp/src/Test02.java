class Ex{
  static int count;
  {
 count++; 
  }
  Ex(){
	  this(5);  
  }
  Ex(int a){
	  this("a");
  }
  Ex(String s){
  }
}

public class Test02 {
	public static void main(String[] args){
		   Ex e1=new Ex();
		   Ex e2=new Ex(5);
		   Ex e3=new Ex("a"); 
		   System.out.println("Total no.of objs created::"+Ex.count);
		 }
}
