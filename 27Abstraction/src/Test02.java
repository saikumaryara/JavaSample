abstract class Example02{
	abstract void m1();
	abstract void m2();
}
abstract class sample02 extends Example02{
	void m1() {
		System.out.println("sample02.m1()");
	}
	//u don't want to impl m2() abstract in sub class 
	//declare this current class as abstract
}
class Xyz extends sample02{
	void m2() {
		System.out.println("Xyz.m2()");
	}
}
abstract class Mno extends sample02{//it shows un impl Mno
	abstract void m1();
	abstract void m3();
}
class Pqr extends Mno{
	void m1() {
		//super.m1();
		System.out.println("Pqr.m1()");
	}
	void m2() {
	    System.out.println("Pqr.m2()");	
	}
	void m3() {
      System.out.println("Pqr.m3()");		
	}
}
public class Test02 {

	public static void main(String[] args) {
    //Example02 e1=new Example02();
	//Example02 e1=new sample02();
	Example02 e1=new Xyz();
	   e1.m1();
	   e1.m2();
	   //e1.m3();
	 Example02 e2=new Pqr();
		e2.m1();
		e2.m2();
		//e2.m3();//m3() is not there in absrract Example class
	((Mno)e2).m3();
	((Pqr)e2).m3();
	}
}
