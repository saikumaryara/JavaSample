//Lazy object creation
public class Example02 {
private int x;
private Example02(){}
private static  Example02 e;
public static Example02 getInstance() {
	if(e==null)
		e=new Example02();
	return e;
}
public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}
}
class Test02{
	public static void main(String[] args) {
		//Example01 e1=new Exapmle01();
		Example02 e1=Example02.getInstance();
	    Example02 e2=Example02.getInstance();
		System.out.println(e1==e2);//Only same object reference will come
		System.out.println(e1.getX()+" "+e2.getX());//0 0
		e1.setX(10);//
		System.out.println(e1.getX()+" "+e2.getX());//10 10
	}
}
/*class Test001{
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("Example02");//Not executed NPC constructoer
	}
}*/

