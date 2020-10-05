
public class custom2 extends Thread {
	public custom2() {
		super();
	}

	public custom2(String msg) {
		super(msg);
	}

	@Override
	public void run() {
		
		  if (this.getName().contains("0")) 
			  this.setPriority(7);
		  else
		      this.setPriority(2);
		 
		for (int i = 0; i <= 50; i++) {
			System.out.println(getName() + " is stated" + i);
		}
	}
}
