//Eager object creation
public class Example01 {
private int x;
private Example01(){
	System.out.println("NPC executed");
}
private static final Example01 e=new Example01();
public static Example01 getInstance() {
	return e;
}
public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}
}
class Test01{
	public static void main(String[] args) {
		//Example01 e1=new Exapmle01();
		Example01 e1=Example01.getInstance();
		Example01 e2=Example01.getInstance();
		System.out.println(e1==e2);//Only same object reference will come
		System.out.println(e1.getX()+" "+e2.getX());//0 0
		e1.setX(10);//
		System.out.println(e1.getX()+" "+e2.getX());//10 10
	}
}
/*class Test{
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("Example01");//NPC is Executed Every time class loading eager object creation
	}
}*/
