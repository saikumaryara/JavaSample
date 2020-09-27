class AB implements Cloneable {
	int x;

	AB() {
		System.out.println("Constructor::");
	}

	@Override
	public AB clone() throws CloneNotSupportedException {
		return (AB) super.clone();
	}
}

public class Test2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		AB a1 = new AB();
		a1.x = 10;
		AB a2 = a1.clone();
		System.out.println(a1 == a2);
		System.out.println(a1.x);
		System.out.println(a2.x);
	}

}
/*
 * Deep Copy vs Shallow Copy
 * 
 * Shallow copy is method of copying an object and is followed by default in
 * cloning. In this method the fields of an old object X are copied to the new
 * object Y. While copying the object type field the reference is copied to Y
 * i.e object Y will point to same location as pointed out by X. If the field
 * value is a primitive type it copies the value of the primitive type.
 * Therefore, any changes made in referenced objects in object X or Y will be
 * reflected in other object. Shallow copies are cheap and simple to make. In
 * above example, we created a shallow copy of object.
 * 
 * Usage of clone() method – Deep Copy
 * 
 * If we want to create a deep copy of object X and place it in a new object Y
 * then new copy of any referenced objects fields are created and these
 * references are placed in object Y. This means any changes made in referenced
 * object fields in object X or Y will be reflected only in that object and not
 * in the other. In below example, we create a deep copy of object. A deep copy
 * copies all fields, and makes copies of dynamically allocated memory pointed
 * to by the fields. A deep copy occurs when an object is copied along with the
 * objects to which it refers. filter_none edit play_arrow
 * 
 * brightness_4 // A Java program to demonstrate deep copy // using clone()
 * import java.util.ArrayList;
 * 
 * // An object reference of this class is // contained by Test2 class Test {
 * int x, y; }
 * 
 * 
 * // Contains a reference of Test and implements // clone with deep copy. class
 * Test2 implements Cloneable { int a, b;
 * 
 * Test c = new Test();
 * 
 * public Object clone() throws CloneNotSupportedException { // Assign the
 * shallow copy to new reference variable t Test2 t = (Test2)super.clone();
 * 
 * t.c = new Test();
 * 
 * // Create a new object for the field c // and assign it to shallow copy
 * obtained, // to make it a deep copy return t; } }
 * 
 * public class Main { public static void main(String args[]) throws
 * CloneNotSupportedException { Test2 t1 = new Test2(); t1.a = 10; t1.b = 20;
 * t1.c.x = 30; t1.c.y = 40;
 * 
 * Test2 t3 = (Test2)t1.clone(); t3.a = 100;
 * 
 * // Change in primitive type of t2 will not // be reflected in t1 field t3.c.x
 * = 300;
 * 
 * // Change in object type field of t2 will not // be reflected in t1(deep
 * copy) System.out.println(t1.a + " " + t1.b + " " + t1.c.x + " " + t1.c.y);
 * System.out.println(t3.a + " " + t3.b + " " + t3.c.x + " " + t3.c.y); } }
 * Output:
 * 
 * 10 20 30 40 100 20 300 0 In the above example, we can see that a new object
 * for Test class has been assigned to copy object that will be returned in
 * clone method.Due to this t3 will obtain a deep copy of the object t1. So any
 * changes made in ‘c’ object fields by t3 ,will not be reflected in t1.
 */