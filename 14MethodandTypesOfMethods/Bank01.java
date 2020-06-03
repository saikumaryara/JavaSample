import java.util.Scanner;
abstract class Customers01{
     String accHolderName;
     long accNo;
     String accType;
	 static double balance=0.0;
	 abstract double withdraw(double a) throws IllegalArgumentException, InvalidAmountException;
	 abstract double CurrentBalance();
	 public static void Deposit(double amt)throws IllegalArgumentException{
     if(amt<=0)
     throw new IllegalArgumentException("Negitive numbers are not allowed");
	    balance=balance+amt;
	 }
}
class Customers02 extends Customers01{
  double withdraw(double amt)throws IllegalArgumentException, InvalidAmountException{
  if(amt<=0) 
  throw new InvalidAmountException("Negitive numbers are not allowed");
  if(amt > balance) 
  throw new IllegalArgumentException("Insufficient Balance");
	 balance=balance-amt;
	 return amt;
}
	 double CurrentBalance(){
	  return balance;
	 }
	 
}
class InvalidAmountException extends Exception{
	InvalidAmountException(){
	}
	InvalidAmountException(String s){
		super(s);
	}
}
class Bank01{

	public static void main(String[] args) throws IllegalArgumentException, InvalidAmountException 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("---How Many Account Details You Want To Enter---\n");
        Customers02[] c1=new Customers02[sc.nextInt()];
		System.out.println("---Creating the Customers objects in Array Location---\n");
		for(int i=0;i<c1.length;i++){
		   c1[0]=new Customers02();
		}
		System.out.println(c1.length+" Customers objects are created ::\n");
		System.out.println("---Please Enter Customer Details Here::");
		for(int i=0;i<c1.length;i++){
		  System.out.println("Enter "+(i+1)+" Customer Details");
		  System.out.print("Enter accHolderName::\t");
		  c1[i].accHolderName=sc.next();
		  System.out.print("Enter accNo::\t");
		  c1[i].accNo=sc.nextLong();
		  System.out.print("Enter accType::\t");
		  c1[i].accType=sc.next();
		  Customers01.Deposit(1000.0);
		  double d1=c1[i].CurrentBalance();
		  System.out.println("--Your balance is---"+d1);
		  double d2=c1[i].withdraw(200.0);
		  System.out.println("--Your Withdrawing amout is::"+d2);
		}
	}
}