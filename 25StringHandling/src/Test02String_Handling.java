import java.util.Scanner;

public class Test02String_Handling {//performing Diff operations on string data
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter String::");
    String s1=sc.nextLine();
    if(s1.equals("sai"))
    	System.out.println("hi "+s1.toUpperCase());
    else
    	System.out.println("Are You "+s1.concat("kumar") +"?"); 	
	String str="naresh";
	System.out.println(str);
	System.out.println(str.concat("it"));
	System.out.println(str.toUpperCase());//here NARESH only come becoz String is immutable
	
  }
}