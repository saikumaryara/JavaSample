class Test02{
	 Test02(){
	    System.out.println("Test02::"+this);
	 }
	public static void main(String[] args) 
	{
		Test02 t1=new Test02();//here t1 scope  is not ended 
	   for(int i=0;i<5;i++){
	   Test02 t2=new Test02();//Here total 6 objects are created including t1.
	 } //After for loop except t1 all are un-referenced.
	 Test02 t3;
	 for(int i=0;i<5;i++){
	   t3=new Test02();
	 }//After for loop except t1 all are un-referenced.
	  Test02 t4=null;
	 for(int i=0;i<5;i++){
	   t4=new Test02();
	 }//After for loop except t1 all are un-referenced.
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
