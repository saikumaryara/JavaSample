//>>Just compile and see which one is allowed and which one is not.
//For outer class(default and public AMs are only allowed)
//private class M1{}
class M2{}
//protected class M3{}
public class M4{}//when ur write this save with M4.java because it is public class
class P
{
   //For class level inner classes(all 4 AMs are allowed)
    private class Q1{}
	 class Q2{}
	 protected class Q3{}
	 public class Q4{}
    //For Method level inner classes(all 4 AMs are not allowed except default)
	private void m10(){
	//private class R1{}
	        class R2{}
	//protected class R3{}
	//public class R4{}
	}
}
abstract class  Abc
{
	//For class level variables (all 4 AMs are allowed at class level) 

	private int x1=10;
             int x2=20;
    protected  int x3=30;
    public   int x4=40;

	//For Method level variables(all 4 AMs are Not allowed at method level)
	void m1(/*private*/int a)
	{
	  //private int q1=10;
	}

    //For concreate methods(all 4 AMs are allowed)
	private void m2(){}
	        void m3(){}
	protected void m4(){}
	public void m5(){}

	 //For abstract methods(private AM is not allowed,but default protected,public are allowed)
  // private abstract void m6();//CE illeagal combination of modifier
   abstract void m7();
   protected abstract void m8();
   public abstract void m9();

//For Outer class default constructor (default and public AMs are allowed)
//For Inner class default constructor (all 4 AMs are allowed)
//NPC and PC (all 4 AMs are allowed)
  private Abc(){}
  Abc(int a){}
  protected Abc(double d){}
  public Abc(String s){}

  //For Blocks level(all 4 AMs are Not allowed)
	//private{}
	{}//this is not default AM
	//protected{}
	//public{}
}
/*class Bbc
{
	public static void main(String[] args) 
	{
      // Abc a=new Bbc();
		System.out.println("Hello World!");
	}
}*/
