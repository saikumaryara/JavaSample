class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("run executed");
	}
}
public class Test01 {

	public static void main(String[] args) throws InterruptedException {
          System.out.println("main start");
          MyThread mt=new MyThread();
          mt.start();
          Thread.sleep(2000);
          System.out.println("main end");
	}

}
