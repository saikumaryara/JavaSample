
//executing concurrently diff logics withdraw() deposit() for multiple threads instances(for mutilple customers)
import java.util.Scanner;

class AmountDeposit01 extends Thread {
	int balance = 0;
	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		deposit();
	}

	private void deposit() {
		System.out.println("Enter amt for deposit ");
		int amt = sc.nextInt();
		balance = balance + amt;
		System.out.println("amount deposited" + getName());
	}
}

class Withdraw01 extends Thread {
	int balance = 0;
	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		withdraw();
	}

	private void withdraw() {
		System.out.println("Enter amt for withdraw ");
		int amt = sc.nextInt();
		balance = balance - amt;
		System.out.println("amount withdrawing" + getName());
	}
}

public class Test09 {

	public static void main(String[] args) {
		System.out.println("main start");
		AmountDeposit01 a1 = new AmountDeposit01();
		AmountDeposit01 a2 = new AmountDeposit01();
		AmountDeposit01 a3 = new AmountDeposit01();
		a1.start();
		a2.start();
		a3.start();
		Withdraw01 w1 = new Withdraw01();
		Withdraw01 w2 = new Withdraw01();
		Withdraw01 w3 = new Withdraw01();
		w1.start();
		w2.start();
		w3.start();
		System.out.println("main end");
	}

}
