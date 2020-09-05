import java.util.Scanner;

interface NumberOperation {
	void eval(int x);
}

class Calc {
	void eval(NumberOperation expr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one Number::");
		expr.eval(sc.nextInt());
	}
}

class Square implements NumberOperation {//java 1.0 Outer calss

	@Override
	public void eval(int x) {
		System.out.println("From Outer calss");
		System.out.println("squre of " + x + " is::" + (x * x));
	}

}

class Cube implements NumberOperation {

	@Override
	public void eval(int x) {
		System.out.println("From Outer calss");
		System.out.println("cube of " + x + " is::" + (x * x * x));
	}

}

public class Test01 {

	public static void main(String[] args) {
		Calc c = new Calc();
		//Approach 1::java 1.0
		c.eval(new Square());
		c.eval(new Cube());
		
		//Approac 2::Anonymous Inner Class(AIC) java 1.1
		c.eval(new NumberOperation() {
			@Override
			public void eval(int x) {
				System.out.println("From AIC calss");
           System.out.println("cube of " + x + " is::" + (x * x * x));
			}
		});
		
		//Approach 3::Lambda Expression
		c.eval((int x)->{System.out.println("From LE1:: 10 Times of" +x+ " is::"+x*10);});
		c.eval((x)->{System.out.println("From LE2:: 20 Times of" +x+ " is::"+x*20);});
		
	}

}
