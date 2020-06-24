/*Develop a Room obj in real world 
 */
public class Room01 {
private double length;
void Display() {
	System.out.println( "Room01 [getLength()=" + getLength() + ", getBreadth()=" + getBreadth() + "]");
}
private double breadth;
Room01(double length,double breadth){
	this.length=length;
	this.breadth=breadth;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getBreadth() {
	return breadth;
}
public void setBreadth(double breadth) {
	this.breadth = breadth;
}
void Area(){
 double area=length*breadth;
  System.out.println("Area of Room1 is::"+area);
}
void Perimeter(){
  double perimeter=2*(length+breadth);
  System.out.println("perimeter of Room1 is::"+perimeter);
}
}
class Building{
	public static void main(String[] args) {
		Room01 r1=new Room01(10,20);
		r1.Display();
		r1.Area();
		r1.Perimeter();
		r1.setLength(15);
		r1.setBreadth(25);
        System.out.println("After changing length and breadth of rooom");
		r1.Display();
		r1.Area();
		r1.Perimeter();
		}
}
