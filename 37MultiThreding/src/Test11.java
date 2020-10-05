
public class Test11 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		custom2 c1 = new custom2();
		custom2 c2 = new custom2();

		System.out.println(c1.getPriority());
		System.out.println(c2.getPriority());
		c1.setPriority(3);
		c2.setPriority(9);// Here ur setting max priority to c2 but
		// cpu 1st execute for whic thread takes less time
		Thread.sleep(1000);
		c1.start();
		c2.start();
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		c1.setName("counter 0");
		c2.setName("counter 1");
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		/*
		 * c1.start(); c2.start(); After succefully execution of threds we don't cal
		 * again
		 */
	}
}
