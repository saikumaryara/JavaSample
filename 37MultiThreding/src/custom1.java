
public class custom1 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
		System.out.println(this.getState()+"@@@@@");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/*
		 * System.out.println(this.getState());
		 */		System.out.println("run end");

	}
}
