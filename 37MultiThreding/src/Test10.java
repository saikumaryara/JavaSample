
public class Test10 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		custom1 c1 = new custom1();
		System.out.println(c1.getState());
		c1.start();
		Thread.sleep(500);
		System.out.println(c1.getState());
		Thread.sleep(5000);
		System.out.println(c1.getState());
	}

}
