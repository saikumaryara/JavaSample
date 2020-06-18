class Test05{
	  Test05(){
	    System.out.println("Test05::"+this);
	    }
	     Test05 t1;//if U want to access NSMand variables U must create object for this class.
		 void m1(){
		   t1=new Test05();//not egc
		}
	public static void main(String[] args) 
	{
        Test05 e1=new Test05();
       e1.m1();//upto now e1,t1 objs are created Here 1st time created t1 object is not eligible for egc.
        e1.m1();//When u call second time m1() 1st time created t1 object is unreferenced/and again t1 is created
		//So 3 objs created 1 is un-referenced
		e1=null;//Now both 3 objs unrefenced
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