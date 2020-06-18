class Test03{
	  Test03(){
	    System.out.println("Test03::"+this);
	    }
		static void m1(){
		  Test03 t1=new Test03();//egc
		}
		static void m2(){
		  Test03 t2=new Test03();//egc
		}
	public static void main(String[] args) 
	{
        m1();//upto now Here 1st time created t1 object is eligible for egc.
        m1();//again new obj for t1 is created it is also egc.
	    System.out.println();
		System.gc();//removed un refenced objects from GC see in finalize output
		try{
		   Thread.sleep(500);
		}catch(Exception e){}
	}
	@Override
	protected void finalize(){
	    System.out.println("In finalize::"+this);
	}
}