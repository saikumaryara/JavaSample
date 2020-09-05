interface Love{
    void getMarriage();
}
class Job implements Love{
  public void getMarriage(){
	  System.out.println("You get married");
  }
}
class Jobless implements Love{
 public void getMarriage(){
	System.out.println("You never get married");
 }
}
interface Mobile{
	void DisplaySize();
}
interface charger{
	void battery();
}
class Apple implements Mobile{
	public void DisplaySize() {
   String fullLength="6.0 inch";		
   System.out.println("Display size of Apple::"+fullLength);
	}	
}
class OnePlus implements Mobile,charger{
	public void DisplaySize() {
     String fullLength="6.5 inch";		
     System.out.println("Display size of OnePlus::"+fullLength);
	}
	public void battery() {
	  String batteryLength="5000mah";
	  System.out.println("OnePlus.battery()::"+batteryLength);	
	}	
}
public class customer {

	public static void main(String[] args) {
     Mobile m1=new Apple();
     m1.DisplaySize();
     Mobile m2=new OnePlus();
     m2.DisplaySize();
     charger c1=new OnePlus();
     c1.battery();
     //charger c2=new Apple();//becouse we are not implementing charger for Apple
       //c2.battery();
     Love l1=new Job();
     l1.getMarriage();
     Love l2=new Jobless();
     l2.getMarriage();
	}
}
