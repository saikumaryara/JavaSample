//executing concurrently same logic deposit() for multiple threads instances(for mutilple customers)
import java.util.Scanner;

class AmountDeposit extends Thread{
	int balance=0;
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amt for deposit ");
		deposit(sc.nextInt());
	}

	private void deposit(int amt) {
		balance=balance+amt;
		System.out.println("amount deposited"+getName());
	}
}
public class Test08 {

	public static void main(String[] args) {
		System.out.println("main start");
		AmountDeposit a1=new AmountDeposit();
		AmountDeposit a2=new AmountDeposit();
		AmountDeposit a3=new AmountDeposit();
		a1.start();
		a2.start();
		a3.start();
        System.out.println("main end");
	}

}
/*
 * //Bank Project import java.util.Scanner; class MyThread8 extends Thread{
 * private double amt; private double balance=10000; public MyThread8(double
 * amt){ this.amt = amt; }
 * 
 * @Override public void run() { if(amt<0) {
 * System.out.println("Invalid Amount"); } else { deposit(amt);
 * System.out.println("After Deposit CurrentBalance: "+balance);
 * System.out.println("Deposited successfully amount: "+amt); } } void
 * deposit(double amt) { this.balance = this.balance + amt; } void
 * currentBalance() { System.out.println(balance); } }
 *
 *
 * class MyThread9 extends Thread{ private double amt; private double
 * balance=10000; public MyThread9(double amt){ this.amt = amt; }
 * 
 * @Override public void run() { if(amt>balance) {
 * System.out.println("Withraw unsuccessful "); } else { withdraw(amt);
 * System.out.println("After withdraw CurrentBalance: "+balance);
 * System.out.println("withdrawn successfully amount: "+amt); } } void
 * withdraw(double amt) { if(amt>balance) {
 * System.out.println("Insufficient fund"); } else { this.balance = this.balance
 * - amt; } } void currentBalance() { System.out.println(balance); } } public
 * class BankProject { public static void main(String[] args) { Scanner scn =
 * new Scanner(System.in); System.out.println("main start");
 * System.out.print("Enter amount for deposit: "); MyThread8 mt1 = new
 * MyThread8(scn.nextDouble()); System.out.print("Enter amount for withdraw: ");
 * MyThread9 mt2 = new MyThread9(scn.nextDouble()); mt1.start(); mt2.start();
 * System.out.println("main end"); } }
 */