interface I1{
	public  void m1();//internally it is absract method must ovveride in implemention sub class
	public default void m2() {//it is inherted to implementation sub class ,it optional to override in implemention class
		System.out.println("Default method m2() from I1");
		//addReuse();
	}
	/*private static void addReuse() {//reusable only in interface default,static methods wherever is required
		int a=10;
		int b=20;
		System.out.println(a+b);
	}*/
	public static void m3() {//for reausable in all impl classes
	  System.out.println("Static method m3() from I1");	
	  //addReuse();
	}
	public static void main(String[] args) {
	  System.out.println("from java8v onwards interface ave main()::");
	}
}
class C implements I1{

	@Override
	public void m1() {
     System.out.println("am m1() from class C");		
	}
   void m4() {
	   m1();//internally this.m1();
	   m2();
	   //m3();//u can't call directly
	   I1.m3();
	   I1 i1=new C();
	   //i1.m3();//u can't call by interface refernce variable
   }
   
}
public class Test01 {

	public static void main(String[] args) {
        C c1=new C();
        c1.m1();
        c1.m2();
        //c1.m3();
        c1.m4();
          I1.m3();
          I1 i1=new C();
   	   //i1.m3();//u can't call by interface refernce variable
	}

}
