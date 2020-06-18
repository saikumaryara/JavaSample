import java.io.*;
class Example01{
	int x=10;
	FileOutputStream fos;
	Example01(){
	   System.out.println("Example01::"+this);
	   try{
	        fos=new FileOutputStream("abc.txt");
	      }catch(IOException e){}
	}
	@Override
	protected void finalize(){
					System.out.println("In finalize::"+this);
	  try{
	       fos.close();//clea up code or resources releasing upto now te two objects fos,e1 is not eligible for garbage collection.
		    fos=null; 
			// un referesing logic
	     }catch(Exception ee){}
	}
	public static void main(String[] args) 
	{
		
	 Example01 e1=new Example01();
		e1=null;
		System.out.println();
		System.gc();
		try{
		   Thread.sleep(500);
		}catch(Exception e){}
	}
	
}
