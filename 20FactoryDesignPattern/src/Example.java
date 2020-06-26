import java.util.Scanner;

class Example {
	private int x;
	
	private Example(){ }

	/* factory method -> creating and returning same class Example class object */
	static Example getExample(){		

		Scanner scn = new Scanner(System.in);
		Example e = new Example();
		
		System.out.print("\nEnter x value: ");
		e.x = scn.nextInt();

		return e;
	}
	
	public void setX(int x){
		this.x = x;
	}

	public int getX(){
		return x;
	}
}
class A{
	void m1(){
		//Example e1 =new Example();Never allow other clases to create obj of Factory class
		Example e1 = Example.getExample();
		System.out.println("From class A e1: "+ e1);
		System.out.println("From class A x: " + e1.getX());
		e1.setX(10);
		System.out.println("From class A x: " + e1.getX());
	}		
}
	
class B{
	void m1(){
		Example e1 = Example.getExample();
		System.out.println("From class B e1: "+ e1);
		System.out.println("From class B x: " + e1.getX());
		e1.setX(20);
		System.out.println("From class B x: " + e1.getX());
	}		
}
class Test {
	public static void main(String[] args){
		//Example e1 = new Example();

		A a1 = new A();
		a1.m1();

		System.out.println();

		B b1 = new B();
		b1.m1();

	}
}
