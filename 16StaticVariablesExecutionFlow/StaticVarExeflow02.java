class StaticVarExeflow02{
   static int a=m1();
   static int m1(){
   System.out.println("variale a is created:m1()executed");
     return 10;
   }
   static int m2(){
   System.out.println("variale b is created:m2()executed");
   return 20;
   }
	public static void main(String[] args){

		System.out.println("main::");
		System.out.println("a::"+a);
		System.out.println("b::"+b);
	}
	static int b=m2();
}
