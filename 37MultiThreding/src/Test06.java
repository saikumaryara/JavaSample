//same logic wit diff state for mmutliple instances each thread by passing diff input to eac thread
class T4 extends Thread{
	private int x;
	public T4(int x) {
          this.x=x;
	}
	@Override
	public void run() {
		System.out.println("run start"+getName());
		for(int i=0;i<x;i++) {
			System.out.println(getName()+"run "+i);
		}
		System.out.println("run end"+getName());
	}
	
}
public class Test06 {

	public static void main(String[] args) {
      System.out.println("main start");
      T4 t1=new T4(5);
       t1.start();
       T4 t2=new T4(10);
       t2.start();
            
      System.out.println("main end");
	}

}
