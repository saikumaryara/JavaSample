
public class Test {

	public static void main(String[] args) {
    Ex e1=new Ex(10,20);
    Ex e2=new Ex(10,20);
    A a=new A();
    a.m1(e1);
	}
}
class A{
	void m1(Object obj) {
		System.out.println(obj.getClass().getName());
	}
}
