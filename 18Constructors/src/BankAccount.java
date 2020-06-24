import java.util.Scanner;

public class BankAccount {
private long accNum;
private String accHname;
private double balance;
private static String bankName;
private static String branchName;
private static String ifsc;
static {
	bankName="Syndicate";
	branchName="Bhiknoor";
	ifsc="SYND0003518";
}
BankAccount(){

}
BankAccount(long accNum){
	this.accNum=accNum;
}
BankAccount(long accNum,String accHname,double balance){
	this.accNum=accNum;
	this.accHname=accHname;
	this.balance=balance;
}
public void deposit(double amount) {
	balance=balance+amount;
}
public void withraw(double amount) {
	balance=balance-amount;
}
public void CurrentBalance() {
	System.out.println("Your CurrentBalance is::"+balance);	
}
public void transferAmount(BankAccount destAcc,double amount) {
	this.balance=balance-amount;
	destAcc.balance=balance+amount;
}
public void Display() {
	System.out.println("BankName::\t"+this.bankName);
	System.out.println("BranchName::\t"+branchName);
	System.out.println("Ifsc::\t\t"+ifsc);
	System.out.println("AccNum::\t"+accNum);
	System.out.println("AccHName::\t"+accHname);
	System.out.println("Balance::\t"+balance);
}
public long getAccNum() {
	return accNum;
}
public void setAccNum(long accNum) {
	this.accNum = accNum;
}
public String getAccHname() {
	return accHname;
}
public void setAccHname(String accHname) {
	this.accHname = accHname;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public static String getBankName() {
	return bankName;
}
public static String getBranchName() {
	return branchName;
}
public static String getIfsc() {
	return ifsc;
}
}
class Bank{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	BankAccount b1=new BankAccount();
	System.out.println("Enter b1 Object Values:");
	System.out.println("Enter AcNum::");
	b1.setAccNum(sc.nextLong());
	sc.nextLine();
	System.out.println("Enter AccHName::");
	b1.setAccHname(sc.nextLine());
	System.out.println("Enter Amount You want to Deposit::");
	b1.deposit(sc.nextDouble());
	BankAccount b2=new BankAccount();
	System.out.println("Enter b2 Object Values:");
	System.out.println("Enter AcNum::");
	b2.setAccNum(sc.nextLong());
	sc.nextLine();
	System.out.println("Enter AccHName::");
	b2.setAccHname(sc.nextLine());
	System.out.println("Enter Amount You want to Deposit::");
	b2.deposit(sc.nextDouble());
   
    b1.Display();
	b2.Display();
	
	}
}
