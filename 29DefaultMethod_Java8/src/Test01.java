interface Example{
	public abstract void m1();
	public default void m2() {//for without breaking contract to impl classes
		//it is inherted to implementation sub class
		System.out.println("Default method m2() from interface only");
	}
}
//class sample implements Example{}
abstract class sample2 implements Example{}

class sample3 implements Example{

	@Override
	public void m1() {
		System.out.println("abstract method from sample3 class");
	}
	
	
}
class Xyz implements Example{

	@Override
	public void m1() {
		System.out.println("abstract method mm2() from Xyz class");
	}
	@Override
	public void m2() {
		System.out.println("Default method m2() from Xyz class");
	}
}
public class Test01 {

	public static void main(String[] args) {
	   Example e;
	   e=new sample3();
	   e.m1();
	   e.m2();//it will execute from I1 only
	   System.out.println();
	   e=new Xyz();
	   e.m1();
	   e.m2();//it will execute from Xyz because we are implemention in Xyz
	}

}
