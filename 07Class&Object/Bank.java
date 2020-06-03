/*
Develop a project to create RealWorldObject BankAccount in Programming World
Store bankName,branchName,ifsc,accno,accHName,balance of two customers/bankaccounts
You assign hardcoded values of both customers
print those customers details on pass book 
*/

class BankAccount{
	String bankName;
	String branchName;
	String ifsc;
    long accNo;
	String accHName;
	double balance;
	
}
class Bank
{
	public static void main(String[] args){
	BankAccount b1=new BankAccount();
	BankAccount b2=new BankAccount();
	b1.bankName="Syndicate";
	b1.branchName="BHIKNOOR";
	b1.ifsc="SYNB0003518";
    b1.accNo=3518220245L;
	b1.accHName="saikumar yara";
	b1.balance=50000.0;

	b2.bankName="Syndicate";
	b2.branchName="BHIKNOOR";
	b2.ifsc="SYNB0003518";
    b2.accNo=35182202452L;
	b2.accHName="prasad yara";
	b2.balance=100000.0;
    System.out.println("----FIRST CUSTOMER BANK DETAILS---");
	System.out.println("bankName     \t::"+b1.bankName);
	System.out.println("branchName   \t::"+b1.branchName);
	System.out.println("ifsc         \t::"+b1.ifsc);
	System.out.println("accNo        \t::"+b1.accNo);
	System.out.println("accHName     \t::"+b1.accHName);
	System.out.println("balance      \t::"+b1.balance);
	System.out.println("----SECOND CUSTOMER BANK DETAILS---");
	System.out.println("bankName     \t::"+b2.bankName);
	System.out.println("branchName   \t::"+b2.branchName);
	System.out.println("ifsc         \t::"+b2.ifsc);
	System.out.println("accNo        \t::"+b2.accNo);
	System.out.println("accHName     \t::"+b2.accHName);
	System.out.println("balance      \t::"+b2.balance);
 }
}