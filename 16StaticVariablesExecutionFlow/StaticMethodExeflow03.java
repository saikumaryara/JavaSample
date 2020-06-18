class StaticMethodExeflow03{
   static void m1(){
   System.out.println("m1()executed");
    
   }
   static void m2(){
   System.out.println("m2()executed");
   }
	public static void main(String[] args){

		System.out.println("main::");
		m1();
		m2();
		
	}
}
