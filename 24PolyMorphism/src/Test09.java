class Addition{
	static void add(int i1,int i2) {
		System.out.println(i1+i2);
	}
	static void add(float f1,float f2) {
		System.out.println(f1+f2);
	}
	static void add(String s1,String s2) {
		System.out.println(s1+s2);
	}
}
public class Test09 {
	public static void main(String[] args) {
		Addition.add(5,6);
		Addition.add(5.6f,6.6f);
		Addition.add("JA","VA");
	}
}
