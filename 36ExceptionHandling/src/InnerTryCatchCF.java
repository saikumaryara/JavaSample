class InnerTryCatchCF{
	public static void main(String[] args){
		try{			
			System.out.println("Inside outer try");
			System.out.println(10/0);

			try{
				System.out.println("Inside Inner try");
			}
			catch(ArithmeticException ae){
				System.out.println("Inside Inner catch");
			}
			System.out.println("After inner catch");
		}
		catch(NullPointerException ae){
			System.out.println("Inside outer catch");
		}
		System.out.println("After outer catch");
	}
}