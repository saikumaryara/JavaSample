class Example02{
	private int x;
	Example02(int x){
		if(x>0)
		    this.x=x;
		else
			System.out.println("negitive-number are not allowed");
		//the above condition is not applicable to all constructors
		//Writing this above logic in every constructor is code redundency
		//to overcome tihs problem use Non-Static block
		//the NSB inside logic will go to every constructor at the time of seperate object creation. 
	}
/*	{
		
	}*/
	Example02(Integer x){
		//this.x=x.intValue();
		this(x.intValue());
	}
	Example02(String x){
		this(Integer.parseInt(x));
	}
}
public class ConstructorOverloading02_prob {
	public static void main(String[] args) {
		
	}
}
