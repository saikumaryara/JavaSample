
public class Manager {
	private double sal;
	private Manager(){
		System.out.println("NPC executed");
	}
	private static  Manager e;
	public static Manager getInstance() {
		if(e==null)
			e=new Manager();
		return e;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}
class Employee{
	public static void main(String[] args) {
		//Manager m1=new Manager();
		Manager e1=Manager.getInstance();
		Manager e2=Manager.getInstance();
		e1.setSal(20000.0);
		System.out.println("Your Salary is::"+e1.getSal());
	}
}
