import java.util.Scanner;
abstract class BankAccount02{
   public static String bankName;
   public static String branchName;
   public static String ifsc;
   private long accNo;
   private  String accHName;
   private  double balance=0.0;
   abstract void openAccount();
   abstract double withdraw(double a) throws IllegalArgumentException;
   abstract double CurrentBalance();
   abstract public  void Deposit(double amt)throws IllegalArgumentException;
   abstract public void TransferAmt(double amount, Account from, Account to)throws IllegalArgumentException;
	public static String getBankName() {
		return bankName;
	}
	
	public static void setBankName(String bankName) {
		BankAccount02.bankName = bankName;
	}
	
	public static String getBranchName() {
		return branchName;
	}
	
	public static void setBranchName(String branchName) {
		BankAccount02.branchName =branchName;
	}
	
	public static String getIfsc() {
		return ifsc;
	}
	
	public static void setIfsc(String ifsc) {
		BankAccount02.ifsc =ifsc;
	}
	
	public long getAccNo() {
		return accNo;
	}
	
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	
	public String getAccHName() {
		return accHName;
	}
	
	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
class Account extends BankAccount02{
	Scanner KB=new Scanner(System.in);
	
	public void Deposit(double amt)throws IllegalArgumentException{
     if(amt<=0)
     throw new IllegalArgumentException("Negitive numbers are not allowed");
	 System.out.println("---Your Depositing Amount is::"+amt);
	    setBalance(getBalance()+amt);
	    
	}
	
	public double withdraw(double amount)throws IllegalArgumentException{
       if(amount<0)
	       throw new IllegalArgumentException("please enter valid amount"); 
       if(amount>getBalance())
	       throw new IllegalArgumentException("insufficient balance"); 
       setBalance(getBalance()-amount);
       System.out.println("---Your Withdrawing :: "+amount);
         return amount;
    }
	
	double CurrentBalance(){
	  System.out.println("---Your Current Balance is::"+getBalance());
	  return getBalance();
	 }
	public static void TransferAmt(Account from,Account to) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Are You Want To Tranfer amount:: --Enter if(yes/no)::");
	  	char ch1=sc1.nextLine().charAt(0);
		  	if(equalsIgnoreCase(ch1)=='y') {
		  		System.out.println("For Which Account You Want To Tranfering amount::");
				  	            System.out.println("Enter Amount To tanfer::");
				               	double Tamount=sc1.nextDouble();
				  	   if(Tamount<=0) 
				  		              throw new IllegalArgumentException("please enter some In available amount::");
				  	   else {
				  	        from.setBalance(from.getBalance()-Tamount);
				  		    to.setBalance(to.getBalance()+Tamount);
				  		    System.out.println("\nFunds successfully transfered.");
				  		    System.out.println("---Your Current Balance is::"+from.getBalance());
				  	 
				  	       }
				  	}
			  	 else {
			  		 System.out.println("::Insufficient Balance::");
			  	 } 
			  	
	  		 System.out.println("::--YourTranfer operation is Declained ::");	
			  	
	  	 }
	  	
	private static char equalsIgnoreCase(char ch1) {
		// TODO Auto-generated method stub
		return ch1;
	}

	void openAccount()
	{ 
		System.out.print("Enter Account No: ");
		setAccNo(KB.nextLong());
		System.out.print("Enter Name: ");
		KB.nextLine();
		setAccHName(KB.nextLine());		
	}

	@Override
	public void TransferAmt(double amount, Account from, Account to) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}
	
}
class TestBank03
{

	public static void main(String[] args){
	//Account b1=new Account();
	//Account b2=new Account();
    Scanner sc=new Scanner(System.in);
  //create initial accounts
  	System.out.print("How Many Customer Accounts U Want to Input :: ");
  	int n=sc.nextInt();
  	Account[] b1=new Account[n];
  	for(int i=0;i<b1.length;i++)
	{   
		b1[i]=new Account();
		b1[i].openAccount();
		BankAccount02.setBankName("Syndicate");
		BankAccount02.setBranchName("BHIKNOOR");
		BankAccount02.setIfsc("SYNB0003518");
	}
  	for(int i=0;i<b1.length;i++)
	{
  	System.out.println("---- CUSTOMER BANK DETAILS---\n");
	System.out.println("bankName     \t::"+BankAccount02.getBankName());
	System.out.println("branchName   \t::"+BankAccount02.getBranchName());
	System.out.println("ifsc         \t::"+BankAccount02.getIfsc());
	System.out.println("accNo        \t::"+b1[i].getAccNo());
	System.out.println("accHName     \t::"+b1[i].getAccHName());
	System.out.println("balance      \t::"+b1[i].getBalance());
	System.out.println("How Much amount you want to Deposit:: \n please enter some Amount::\n");
	 b1[i].Deposit(sc.nextDouble());
	 System.out.println("How Much amount you want to withdraw:: \n please enter some Amount:: \n");
	    b1[i].withdraw(sc.nextDouble());
		b1[i].CurrentBalance();
		
  	    //Account.TransferAmt(b1[1],b1[0]);
	}
  	/*System.out.println("Are You Want To Tranfer amount:: --Enter if(yes/no)::");
  	char ch1=sc.nextLine().charAt(0);
	  	if(equalsIgnoreCase(ch1)=='y') {*/
  	for(int i1=0;i1<b1.length;i1++) {
  	     if(i1==0)
             System.out.println("----\n First CUSTOMER BANK DETAILS---"); 	     
  	     else 
  	    	System.out.println("----\n SECOND CUSTOMER BANK DETAILS---");
  	    System.out.println("bankName     \t::"+BankAccount02.bankName);
  		System.out.println("branchName   \t::"+BankAccount02.branchName);
  		System.out.println("ifsc         \t::"+BankAccount02.ifsc);
  		System.out.println("accNo        \t::"+b1[i1].getAccNo());
  		System.out.println("accHName     \t::"+b1[i1].getAccHName());
  		System.out.println("balance      \t::"+b1[i1].getBalance());
 
     }
  	sc.close();
	}
   
	@SuppressWarnings("unused")
	private static char equalsIgnoreCase(char ch1) {
		// TODO Auto-generated method stub
		return ch1;
	}
	
}