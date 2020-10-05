class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("run executed");
	}
}
public class Test01 {

	public static void main(String[] args) {
          System.out.println("main start");
          MyThread mt=new MyThread();
          mt.start();
          System.out.println("main end");
	}

}
