import java.util.Scanner;
class NSB 
{
	int x;
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X value::");
		x=sc.nextInt();
	}
	NSB(){
		System.out.println("NPC");
		System.out.println(this.x);
	}
	NSB(int a){
		System.out.println("IPC");
		System.out.println(this.x);
	}
	NSB(String s){
		System.out.println("SPC");
		System.out.println(this.x);
	}
	NSB(double d){
		System.out.println("DPC");
		System.out.println(this.x);
	}
	public static void main(String[] args) 
	{ 
		NSB n1=new NSB();
		NSB n2=new NSB(15);
		NSB n3=new NSB("sai");
		NSB n4=new NSB(24.0);
	}
}
