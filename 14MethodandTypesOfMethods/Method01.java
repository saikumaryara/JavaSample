class  Method01
{
  static void add(int fno,int sno){
		int c=fno+sno;
		System.out.println("THE ADDITION OF  "+fno+"  AND  "+sno+" is::  "+c);
	}
  static int sub(int fno,int sno){
		int c=fno-sno;
   System.out.println("THE SUBSTRACTION OF  "+fno+"  AND  "+sno+" is::  "+c);
		return c;

	}
  static int mul(int fno,int sno){
	  if(fno<=0||sno<=0)
   throw new IllegalArgumentException("Please enter above 0 value");
		int c=fno*sno;
		System.out.println("THE MUTIPLICATION OF  "+fno+"  AND  "+sno+" is::  "+c);
    return c;
	
	}
  static int div(int fno,int sno){
	  if(sno<=0)
		  throw new IllegalArgumentException("Please divide above 1 value");
	  int c=fno/sno;
	  System.out.println("THE DIVISION OF  "+fno+"  AND  "+sno+" is::  "+c);
      return c;	
	  }
	public static void main(String[] args) 
	{
		  add(10,20);
		  sub(20,10);
		  mul(10,20);
		  //mul(0,20);
		 // div(20,0);
		  div(20,10);
	}
}
