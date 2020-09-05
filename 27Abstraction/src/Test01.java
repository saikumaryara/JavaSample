abstract class Example01{
	abstract void m1();//we must impl m1() in subclass
}
class sample01 extends Example01{
	void m1() {
		System.out.println("sample01.m1()");
	}
}
public class Test01 {

	public static void main(String[] args) {
  //Example01 e1=new Example01();//we can't instantiate for abstract class
		Example01 e1=new sample01();
		e1.m1();
	}

}
