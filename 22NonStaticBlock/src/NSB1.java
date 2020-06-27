import java.util.Scanner;
class NSB1 
{
	static int count=0;
	{
		count++;
	}
	NSB1(){
		System.out.println("NPC");
	}
	NSB1(int a){
		System.out.println("IPC");
	}
	NSB1(String s){
		System.out.println("SPC");
	}
	NSB1(double d){
		System.out.println("DPC");
	}
	public static void main(String[] args) 
	{ 
		NSB1 n1=new NSB1();
		NSB1 n2=new NSB1(15);
		NSB1 n3=new NSB1("sai");
		NSB1 n4=new NSB1(24.0);
		System.out.println("totaL::"+count);
	}
}
