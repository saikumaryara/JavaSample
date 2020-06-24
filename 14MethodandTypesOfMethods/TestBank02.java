class TestBank02{
	 private double balance=20000;
	 public static void main(String[] args){
          TestBank02 b1=new TestBank02();
           b1.withdraw(1000.0);
	}
	public double withdraw(double amount)throws IllegalArgumentException{
 
       if(amount<0)
	       throw new IllegalArgumentException("please enter valid amount"); 
       if(amount>balance)
	       throw new IllegalArgumentException("insufficient balance"); 
       amount=balance-amount;
         return amount;
   }
 public void CurrentBalance(double balance){
 System.out.println("Your current balance is::"+balance);
 }

}