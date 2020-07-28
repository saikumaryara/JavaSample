class Account{


private String bankName;
private  String branchName;
 private  String ifsc;
public String toString() {
	System.out.println("bankName"+bankName);
	System.out.println("branchName"+branchName);
	System.out.println("ifsc"+ifsc);
	return null;
}
public Account(String bankName){
	this(bankName,null);
	this.bankName=bankName;
}
public Account(String bankName,String branchName){
	this(bankName,null,null);
	this.bankName=bankName;
	this.branchName=branchName;
}
public Account(String bankName,String branchName,String ifsc){
	this.bankName=bankName;
	this.branchName=branchName;
	this.ifsc=ifsc;
}
}
class Test{
	public static void main(String[] args) {
 Account a1 = new Account("syndicate");
 Account a2 = new Account("syndicate","Bhiknoor");
 Account a3 = new Account("syndicate","Bhiknoor","SYNB3518");
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
 }
}