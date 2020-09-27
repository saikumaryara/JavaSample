class InnerTryCatchCF2{
	public static void main(String[] args){
		try{
			System.out.println("Inside outter try");
			try{
					System.out.println("Inside Inner try");
					System.out.println(10/0);
			}
			catch(ArithmeticException ae){
					System.out.println("Inside Inner catch");
			}
			System.out.println("After inner catch");
		}
		catch(ArithmeticException ae){
			System.out.println("Inside outter catch");
		}
		System.out.println("After outter catch");
	}
}
