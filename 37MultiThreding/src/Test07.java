class AddThread extends Thread{
   int sum=0;
	@Override
	public void run() {
		for(int i=0;i<=50;i++) {
			sum+=i;
			System.out.println("the sum is::"+sum);
		}
	}
}
class SubThread extends Thread{
	   int diff=0;
		@Override
		public void run() {
			for(int i=50;i>=0;i--) {
				diff-=i;
				System.out.println("the diff is::"+diff);
			}
		}
	}
public class Test07 {

	public static void main(String[] args) {
		System.out.println("main start");
		AddThread a1=new AddThread();
		SubThread s1=new SubThread();
		a1.start();
		s1.start();
		System.out.println("main end");
	}

}
