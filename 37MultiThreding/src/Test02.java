class MyRunnable implements Runnable {
	public void run() {
		System.out.println("run executed");
	}
}

public class Test02 {

	public static void main(String[] args) {
		 System.out.println("main start");
		 MyRunnable mt=new MyRunnable();
       //  mt.start();
		 Thread th=new Thread(mt);
		 th.start();
         System.out.println("main end");

	}

}
