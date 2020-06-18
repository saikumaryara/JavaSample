class Test04{
	  Test04(){
	    System.out.println("Test04::"+this);
	    }
	    static Test04 t1;
		static void m1(){
		   t1=new Test04();//not egc
		}
	public static void main(String[] args) 
	{
        m1();//upto now Here 1st time created t1 object is not eligible for egc.
        m1();//When u call second time m1() 1st time created t1 object is unreferenced/and again t1 is created
		//So 2 objs created 1 un referenced
		t1=null;//Now both 2 objs unrefenced
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