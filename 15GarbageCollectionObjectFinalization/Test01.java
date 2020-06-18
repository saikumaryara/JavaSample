class  Test01{
     Test01(){
	     System.out.println("Test01::"+this);
	 }
	public static void main(String[] args) 
	{   int a=10;
		Test01 t1= new Test01();
		if(a==10){
		Test01 t2=new Test01();//upto now t1,t2 two objs are created
		}//after if{ }now t2 obj is eligible for gc
		Test01 t3;
		if(a==10){
		t3=new Test01();//upto now t1,t2,t3  objs are created
		}//Here ur not writing any extra stmnts after if{} so t3 is egc.
        Test01 t4=null;
		if(a==10){
		t4=new Test01();//upto now t1,t2,t3.t4  objs are created
		}//Here ur not writing any extra stmnts after if{} but ur refencing null after if{}so t4 is not egc.
        Test01 t5;
		if(true){
		t5=new Test01();
		}//t5 scope is not ended so not egc.
		Test01 t6;
		if(false){
		t6=new Test01();//Here t6 obj is not created
		}
        if(a==10){
		  Test01 t7=new Test01();//egc because t7 scope has ended.
		}
       
		if(true){
		Test01 t8=new Test01();
		}//Generally people fells t9 scope is ended and it is egc.
		// but not because it depends on oter stmnts after if block ur writing.
		System.out.println("HI");
		a=30;
		if(a==30){
		  Test01 t9=new Test01();
		}//egc
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
