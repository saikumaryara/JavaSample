class StringConstructorsDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		System.out.println("s1: "+s1);  //abc

		String s2 = new String("abcd");
		System.out.println("s2: "+s2);//abcd
	
		char[] ch = {'x', 'y', 'z'};
		System.out.println("ch: "+ch);//[C@19821f

		System.out.print("ch: ");

		//if we want to print this array value we should use for loop, as shown below
		for ( int i = 0 ; i < ch.length; i++)
		{
			System.out.print(ch[i]);//xyz
		}

		System.out.println();
		
		//converting char array into String is more convenient than writting for loop, as shown below
		String s3 = new String(ch);
		System.out.println("s3: "+s3);//xyz

		
		//creating empty string
		String s4 = "";
		String s5 = new String();
		String s6 = new String("");
		
		System.out.println("s4: "+s4);
		System.out.println("s5: "+s5);
		System.out.println("s6: "+s6);

		//creating null string
		String s7 = null;
		//String s8 = new String(null); CE: ambiguous error
		//String s8 = new String((String)null); RE: NPE
		//String s8 = new String(s7); RE: NPE

		//We can create null String ref variable(s7), but we cannot create String object with null. It leads to NPE

		//creating String object from another String object
		String s8 = new String("A");
		String s9 = new String(s8);
		System.out.println("s8: "+s8);//A
		System.out.println("s9: "+s9);//A
		System.out.println(s8 == s9);//false
		
		//assigning one string object reference to another String reference variable
		String s10 = new String("B");
		String s11 = s10;
		System.out.println("s10: "+s10);//B
		System.out.println("s11: "+s11);//B
		System.out.println(s10 == s11);//true
	}
}
