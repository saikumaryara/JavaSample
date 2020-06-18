class StaticVarExeflow02{
   static int a=m1();
   static int m1(){
   System.out.println("variale SV a is created:m1() is executed");
     return 10;
   }
   static int m2(){
   System.out.println("variale b is created:");
   return 20;
   }
	public static void main(String[] args){

		System.out.println("main::");
		System.out.println("a::"+a);
		System.out.println("b::"+b);
	}
	static int b=m2();
}
