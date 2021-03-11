class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("run executed");
	}
}

public class Test02 {

	public static void main(String[] args) throws InterruptedException {
		 System.out.println("main start");
		 MyRunnable mt=new MyRunnable();
       //  mt.start();
		 Thread th=new Thread(mt);
		 th.start();
		 Thread.sleep(2000);
         System.out.println("main end");

	}

}
