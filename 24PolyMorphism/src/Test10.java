class MethodOverload{
   void m1() {System.out.println("void.m1()");}
   //int m1() {return 10;}
   //int m1(String s) {return 1;}
   static int m1(String s){return 0;}
   static void m1(double d){System.out.println("static void .m1(double)");}
  private void m1(float f){System.out.println("private void m1(float f");}
  // void m1(int i1) {System.out.println("void m1(int)");}
   void m1(int i1,int i2) {System.out.println("void m1(int,int)");}
   void m1(float f1,float f2) {System.out.println("void m1float,float)");}
   void m1(int i1,float f1) {System.out.println("void m1(int,float)");}
   void m1(float f,int i1) {System.out.println("void m1(float,int)");}
   //void m1(long l) {System.out.println("void.m1(long)");}//if m1(5)
   //m1(int)type not there this executes m1(long l) if m1(long l) is also not there
   //search for double type if not CE:upto java 1.4
   //suppose ur using java 5v compiler implicit add autobox to m1(5) to m1(Integer) 
   void m1(Integer i) {System.out.println("Integer");}
   //it m1(Integer )also not there it executes var-arg type m1(int... )
   void m1(int... i) {System.out.println("void.m1(int...)");}
}
public class Test10 {
	public static void main(String[] args) {
		MethodOverload mo=new MethodOverload();
		mo.m1();
		int i=mo.m1("sai");
		System.out.println(i);
		MethodOverload.m1(10.5);
		//mo.m1(10.6f);
		mo.m1(1);
		mo.m1(3,4);
		mo.m1(10.6f, 11.6f);
		mo.m1(6,8);
		mo.m1(11.6f,10.6f);
		mo.m1(13.6f,10);
	}
}
