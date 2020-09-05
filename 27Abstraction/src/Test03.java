abstract class Example03{
	abstract void m1();
	static int a=m2();
    static int m2() {
     System.out.println("Example03. SV");
    	return 50;
	}
    static {
    	System.out.println("Example03. SB");
    }
    public static void main(String[] args) {
       //Example03 e1=new Example03();
    	System.out.println("Example03.main()");
    	m3();
    }
    static void m3() {
      System.out.println("Example03. SM");
    }
    int y=m4();
	 int m4() {
        System.out.println("Example03. NSV");
		 return 60;
	}
	 {
		 System.out.println("Example03. NSB");
	 }
	 Example03(){
		 System.out.println("Example03. NPC");
	 }
	 Example03(int x){
		 System.out.println("Example03. int PC");
	 }
	 void m5() {
		 System.out.println("Example03.m5()");
	 }
}
class sample03 extends Example03{
	void m1() {
     System.out.println("sample03.m1()");		
	}
	sample03(){
	     super();
		System.out.println("sample03. NPC");
	}
	sample03(int x){
		super(5);
		System.out.println("sample03. int PC");
	}
}
public class Test03 {

	public static void main(String[] args) {
		 Example03 e1=new sample03();
	      e1.m1();
	      e1.m5();   
	}

}
