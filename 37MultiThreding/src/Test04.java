class T1 extends Thread {
	@Override
	public void run() {
		for (int i = 30; i <= 50; i++) {
			System.out.println("T1 run :" + i);
		}
	}
}

class T2 extends Thread {
	@Override
	public void run() {
		for (int i = 70; i <= 90; i++) {
			System.out.println("T2 run :" + i);
		}
	}
}

public class Test04 {

	public static void main(String[] args) {
		Thread t1 = new T1();
		t1.start();
		Thread t2 = new T2();
		t2.start();
		for (int i = 1; i <= 20; i++) {
			System.out.println("main :" + i);
		}
	}

}
