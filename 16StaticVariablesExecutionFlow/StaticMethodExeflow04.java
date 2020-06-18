class StaticMethodExeflow04{
  static int a=10;
   static void m1(){
   System.out.println("m1()Before modifying::");
   System.out.println("a::"+a);
    a=20;   
   }
   static void m2(){
	   System.out.println("m1()After modifying::");
   System.out.println("a::"+a);
   }
	public static void main(String[] args){

		System.out.println("main::");
		m1();
		m2();
		a=50;
		System.out.println("main a::"+a);
	}
}
