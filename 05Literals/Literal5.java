class Literal5{
        static int m1(int i1){
		System.out.println("int type m1():"+i1);
		return i1;
		}
		static double m1(double i1){
		System.out.println("double type m1():"+i1);
	        return i1;
		}
		static float m1(float i1){
		System.out.println("float type m1():"+i1);
		return i1;
		}
	    static char m1(char i1){
		System.out.println("char type m1():"+i1);
		return i1;
		}
		static String m1(String i1){
		System.out.println("string type m1():"+i1);
		return i1;
		}
	    
  public static void main(String[] args){
	 // Literal2 l2=new Literal2();//if methods are non-static use obj creation
  m1(5);
   m1(5.0);
   m1(5.0f);
   m1('@');
   m1("saikumar");
  }
}