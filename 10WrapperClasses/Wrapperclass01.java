/*Wrapperclass::->it is a predefined class, Which is used to wrapging/covering Primitive value as an object.
*   it means representing pv as an object.
* It is available in java.base.maodule
* Whenever you need to pass/treat a primitive value as an object must use WCS
* There are 8 tpe of wrapper classes
*  [ 1>Byte 2> Short  3>Integer  >Long 5> Float 6>Double ] These 6 Wcs are sub class of (Number)is a super class
*  [ >Character  8>Boolean ] are sub class of (Object) super class
*  Total  operations are performed By using Wcs
*/
public class Wrapperclass01 
{
	
		static void m1(Object a){
			//Object is super class of all classes   , Whatever type of object/value  etc you pass it will allow.
		System.out.println("a::" +a);
		}		
	public static void main(String[] args) 
	{
		Student s1=new Student();
		Employee e1=new Employee();
		A a=new A();
       m1(s1);
       m1(e1);//Here i am passing s1,e1 objects so no CE so a: Student@7852e922 obj is stored
	 //  m1(5);//if u write like this value is stored Before java 5.0 v is not allowed if u write u must create a class and a variable and stored in that var
	 //and pass that variable as an object to Object parameter
	  	   a.x=5;
           m1(a);

    //form Java 5.0v you can write directly like this bellow 
	
	     m1(5);
		 m1(10.5);
		 m1(new Integer(5));
		 m1(Double.valueOf(10.5));
		 
	}
};
class Student extends Wrapperclass01
{ 
};
class Employee extends Wrapperclass01
{
	
};
class A
{
	int x=5;
}
	