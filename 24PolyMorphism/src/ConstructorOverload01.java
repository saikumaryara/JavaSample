class Example01{
	Example01(){
		System.out.println("no-arg-Example01()");
	}
	Example01(int x){
		System.out.println("int-arg-Example01()");
	}
	Example01(String x){
		System.out.println("String-arg-Example01()");
	}
	Example01(Integer x){
		System.out.println("Integer-arg-Example01()");
	}
	Example01(Object obj){
		System.out.println("Object-arg-Example01()");
	}
}
public class ConstructorOverload01 {
	public static void main(String[] args) {
		Example01 e1=new Example01();
		Example01 e2=new Example01(5);
		Example01 e3=new Example01("a");
		Example01 e4=new Example01('a');
		Example01 e5=new Example01(5.6);
		//Example01 e6=new Example01(null);
		Example01 e7=new Example01((String)null);
		Example01 e8=new Example01((Integer)null);
		Example01 e9=new Example01((Double)null);
	}
}
