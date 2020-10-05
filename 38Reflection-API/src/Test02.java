import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter class name: ");
		String className = scn.next();
		Class<?> cls = Class.forName("B");
		System.out.println(cls + " is loaded");
		//obtained private memebers by using getDeclarexxx()
      Constructor<?> cons=cls.getDeclaredConstructor();
      Object object=
      
	}

}
