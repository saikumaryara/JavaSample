import java.util.Scanner;

@FunctionalInterface
interface I5{
	int add(int a,int b);
}
@FunctionalInterface
interface Mobile{
	String sms(String s);
}
public class LE1 {

	public static void main(String[] args) {
         I5 i1=(int a,int b)->{ int c=a+b; 
                               System.out.println(c);
                               return c;
                              };
         I5 i2=(a,b)->{ int c=a+b;
                        System.out.println(c);                     
                       return c;
                      };
          i1.add(10,20);
          i2.add(20,30);
          System.out.println();
        Mobile m1=(s)->{
        	            System.out.println("Enter Mobile No::");
        	            Scanner sc;
        	            sc=new Scanner(System.in);
						long l1=sc.nextLong();
							
        	           return "a";
        	           };
                  //or
        Mobile m2=(s)->"a";
        
        Mobile m3=(s)->{
        	
        	            return "a";
        	           };
	}

}
