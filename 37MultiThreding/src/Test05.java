//same logic for mutiple instances same logic is executed in each thread
class T3 extends Thread{
	@Override
	public void run() {
		System.out.println("run start"+getName());
		for(int i=0;i<10;i++) {
			System.out.println(getName()+ "run"+i);
		}
		System.out.println("run end");
	}
}
public class Test05 {

	public static void main(String[] args) {
           System.out.println("main start");
           T3 t1=new T3();
           T3 t2=new T3();
           T3 t3=new T3();
           t1.start();
           t2.start();
           t3.start();
           System.out.println("main end");
	}

}
