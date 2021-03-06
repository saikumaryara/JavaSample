
public class Av{
	
	public static  String revString(String s) {
		String result=new StringBuffer(s).reverse().toString();
		return 	result; 
	}
	public static void main(String[] args) {
    System.out.println(revString("sai"));
	}
}
