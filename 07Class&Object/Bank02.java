/*
Here Target is save memory by static
Develop a project to create RealWorldObject BankAccount in Programming World
Store bankName,branchName,ifsc,accno,accHName,balance of two customers/bankaccounts
You assign hardcoded values of both customers
print those customers details on pass book 
*/

class BankAccount02{
	static String bankName="Syndicate";
	static String branchName="BHIKNOOR";
    static String ifsc="SYNB0003518";
    long accNo;
	String accHName;
	double balance;
	
}
class Bank02
{
	public static void main(String[] args){
	BankAccount b1=new BankAccount();
	BankAccount b2=new BankAccount();
	b1.bankName=BankAccount02.bankName;
	b1.branchName=BankAccount02.branchName;
	b1.ifsc=BankAccount02.ifsc;
    b1.accNo=3518220245L;
	b1.accHName="saikumaryara";
	b1.balance=50000.0;

	b2.bankName=BankAccount02.bankName;
	b2.branchName=BankAccount02.branchName;
	b2.ifsc=BankAccount02.ifsc;
    b2.accNo=35182202452L;
	b2.accHName="prasad yara";
	b2.balance=100000.0;
    System.out.println("----FIRST CUSTOMER BANK DETAILS---");
	System.out.println("bankName     \t::"+BankAccount02.bankName);
	System.out.println("branchName   \t::"+BankAccount02.branchName);
	System.out.println("ifsc         \t::"+BankAccount02.ifsc);
	System.out.println("accNo        \t::"+b1.accNo);
	System.out.println("accHName     \t::"+b1.accHName);
	System.out.println("balance      \t::"+b1.balance);
	System.out.println("----SECOND CUSTOMER BRANCH BANK DETAILS---");
	System.out.println("bankName     \t::"+BankAccount02.bankName);
	System.out.println("branchName   \t::"+BankAccount02.branchName);
	System.out.println("ifsc         \t::"+BankAccount02.ifsc);
	System.out.println("accNo        \t::"+b2.accNo);
	System.out.println("accHName     \t::"+b2.accHName);
	System.out.println("balance      \t::"+b2.balance);
 }
}