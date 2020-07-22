class StringPooling 
{
	public static void main(String[] args) 
	{

		String s1 = "a";
		String s2 = "a";	

       	String s3 = new String("a");
		String s4 = new String("b");
		String s5 = new String("b");
		System.out.println(s1 == s2);       //true
		System.out.println(s1.equals(s2));	//true
		System.out.println(s3 == s4);			//false
		System.out.println(s4 == s5);         //false
		System.out.println(s3.equals(s3)); //true

		String s6 = "ab";
		String s7 = "a" + "b"; //=> String s6 = "ab";

		String s8 = "a";
		String s9 = s7 + "b";

		System.out.println(s6 == s7);	//true
		System.out.println(s7 == s9); //false


	}
}
