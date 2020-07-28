class LivingThing{
	void move() {System.out.println("LivingThing.move()");}
}
class Animal extends LivingThing{
	void move() {System.out.println("Animal.move()");}
}
class Person extends LivingThing{
	void move() {System.out.println("Person.move()");}
}
class Bird extends LivingThing{
	void move() {System.out.println("Bird.move()");}
}

public class RuntimePoly01 {

	public static void main(String[] args) {
		LivingThing lt=new Animal();
		lt.move();
		LivingThing lt1=new Bird();
		lt1.move();
	}

}
