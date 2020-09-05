//LamdaExpressions

@FunctionalInterface
interface I1 {
	void m1();
}

@FunctionalInterface
interface I2 {
	void m2(int x);
}

@FunctionalInterface
interface I3 {
	int m3(int a)throws InterruptedException;
}

@FunctionalInterface
interface I4{
	String m4(float f);
}
public class Test {
	public static void main(String[] args)throws InterruptedException{
		I1 i11 = () -> {
		};
		i11.m1();
		I1 i12 = () -> {
			System.out.println("Hi");
		};
		i12.m1();
		I1 i13 = () -> {
			System.out.println("Hello");
		};
		i13.m1();
		System.out.println();
		I2 i21 = (int x) -> {
			System.out.println(x);
		};
		i21.m2(3);
		System.out.println();
		I3 i22 = (x) -> {
			System.out.println(x);
			//throws InterruptedException();
			return x;
		};
		i22.m3(5);
		I3 i23 = x -> {
			System.out.println(x);
			return x;
		};
		i23.m3(7);
        
 	}
}
