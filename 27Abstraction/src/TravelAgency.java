import java.util.Scanner;
class TravelAgency{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	Driver driver=new Driver();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter class name::");
     String clsName=sc.next();
     Class cls=Class.forName(clsName);
     Object obj=cls.newInstance();
     if(obj instanceof Vehicle)
     driver.drive((Vehicle)obj);
     else
    	 System.out.println("the given"+clsName+"Name is Not Found");
	}
}