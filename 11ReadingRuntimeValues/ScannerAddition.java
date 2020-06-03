import java.util.Scanner;
class ScannerAddition{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter FNO:");
		int a=sc.nextInt();
		System.out.println("Enter SNO:");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("THE ADDITION OF  "+a+"  AND  "+b+" is::  "+c);
		sc.close();
	}
}