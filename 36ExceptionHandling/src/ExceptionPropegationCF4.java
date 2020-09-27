class ExceptionPropegationCF4 {
	static int div(int a, int b){
		return a / b; 
	}
	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			int c = div(a, b);	
			System.out.println("The result after dividing "+a+" by " + b + " is "+c);
		}
		catch (ArrayIndexOutOfBoundsException aiob){
			System.out.println("Please pass only atleast two integers");
		}
		catch (NumberFormatException nfe){
			System.out.println("Please pass only integers");
		}
		catch (ArithmeticException ae){
			System.out.println("Please DONOT pass second argument as ZERO");
		}
	}
}