import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter class name: ");
		String className = scn.next();
		Class cls = Class.forName(className);
		System.out.println(cls + " is loaded");
		System.out.println();
		 cls.newInstance();

		/*
		 * System.out.println(
		 * "========================================================="); //
		 * System.out.println("class module name\t\t: " + cls.getModule());
		 * System.out.println("class package name\t\t: " + cls.getPackage());
		 * System.out.println("class modifiers\t\t\t: " +
		 * Modifier.toString(cls.getModifiers()));
		 * System.out.println("class type\t\t\t: " + (!cls.isInterface() ? "class" :
		 * "interface")); System.out.println("class name\t\t\t: " + cls.getName());
		 * System.out.println("class simple name\t\t: " + cls.getSimpleName());
		 * System.out.println("class super name\t\t: " + cls.getSuperclass());
		 * System.out.println("class super interface\t\t: " +
		 * java.util.Arrays.toString(cls.getInterfaces())); System.out.println(
		 * "=========================================================");
		 * System.out.println("class fields information"); // Field[] fa =
		 * cls.getFields(); Field[] fa = cls.getDeclaredFields(); for (int i = 0; i <
		 * fa.length; i++) { Field field = fa[i]; System.out.println("  Field " + (i +
		 * 1) + " information"); System.out.println("     modifier\t: " +
		 * Modifier.toString(field.getModifiers()));
		 * System.out.println("     Data Type\t: " + field.getType());
		 * System.out.println("     Name\t: " + field.getName()); } System.out.println(
		 * "=========================================================");
		 * System.out.println("class Constructors information"); // Constructor[] cons =
		 * cls.getConstructors(); Constructor[] cons = cls.getDeclaredConstructors();
		 * int i = 0; for (Constructor con : cons) { System.out.println();
		 * System.out.println("  Consturctor " + (++i) + " information");
		 * System.out.println("     modifier\t: " +
		 * Modifier.toString(con.getModifiers())); System.out.println("     name\t: " +
		 * con.getName()); System.out.println("     parms List\t: " +
		 * con.getParameterCount()); Parameter[] params = con.getParameters();
		 * System.out.println("     Parameters\t: " + Arrays.toString(params));
		 * System.out.println("     excpetions\t: " +
		 * Arrays.toString(con.getExceptionTypes())); } System.out.println(
		 * "=========================================================");
		 * System.out.println("class Methods information"); // Constructor[] methods =
		 * // cls.getMethds(); Method[] methods = cls.getDeclaredMethods(); i = 0; for
		 * (Method method : methods) { System.out.println();
		 * System.out.println("  Method " + (++i) + " information");
		 * System.out.println("     modifier\t: " +
		 * Modifier.toString(method.getModifiers()));
		 * System.out.println("     ret type\t: " + method.getReturnType());
		 * System.out.println("     name\t: " + method.getName());
		 * System.out.println("     parms List\t: " + method.getParameterCount());
		 * System.out.println("     Parameters\t: " +
		 * Arrays.toString(method.getParameters()));
		 * System.out.println("     excpetions\t: " +
		 * Arrays.toString(method.getExceptionTypes())); } // System.out.println(
		 * 
		 * "=========================================================");
		 * System.out.println("class ICs information"); Constructor[] methods = //
		 * cls.getMethds(); Class[] innerClasses = cls.getNestMembers(); i = 0;
		 * for(Class innerClass: innerClasses) { System.out.println();
		 * System.out.println("     name\t: " + innerClass.getName()); } }
		 */

	}
}
