class Shadowing{
  static int a=10;
    static void m1(int a){
    System.out.println("a::"+a);
    a=a;   
	System.out.println("a::"+a);//local preferences of a variable.
   }
	public static void main(String[] args){

		System.out.println("main::");
		m1(20);
		System.out.println("main a::"+a);
	}
}
