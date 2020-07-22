class StringOperations 
{
	public static void main(String[] args) 
	{
		//comparing two strings
/*
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = new String("Abc");

		System.out.println(s1 == s2);			//false => different references 
		System.out.println(s1.equals(s2)); //true	=> both objects has same state

		System.out.println(s2 == s3);			//false => different references 
		System.out.println(s2.equals(s3)); //false => both objects has different state

		//comaring strings with out case, below method is defined in String class
		//public boolean equalsIgnoreCase(String s)

		String s4 = new String("a");
		String s5 = new String("A");
		System.out.println(s4.equals(s5));							//false => compares strings with case
		System.out.println(s4.equalsIgnoreCase(s5));		//true => compares strings without case

		//comaring strings lexicographically, means after comarision method should return difference between string content, below method is defined in String class
		//public int compareTo(Object obj)					<= inherited from Comparible interface
		//public int compareToIgnoreCase(String s)	<= it is developed in String class

		String s6 = new String("a");
		String s7 = new String("A");
		System.out.println(s6.compareTo(s7));						//32   => a - A => 97 - 65	=>32 		
		System.out.println(s6.compareToIgnoreCase(s7));	//0	  => a - a => 97 - 97	=>0 		

		//System.out.println(s6.compareTo(new Example()));	//with 1.4 compiler it is allowed but leads to CCE 
																										//with 1.5 or above compiler it is not allowed leads to CE, because of Generics concept.

		//printing String state. toString() method is overriden to print String object state

		String s8 = new String("abc");
		System.out.println(s8);//abc
*/
		//concatenating new string, 
		//adding new string at end of old and placing the result in new object is called concatenation
		//We can do it in two ways
		//1. using + operator
		//2. using concat() method
		//public String concat(String newString) 
/*
		//concatenation using + operator
		String s1 = new String("a");
		String s2 = s1 + "b";

		System.out.println(s1);//a
		System.out.println(s2);//ab
		System.out.println(s1 == s2); //false


		//concatenation using concat() method
			String s3 = new String("a");
		String s4 = s1.concat("b");

		System.out.println(s3);//a
		System.out.println(s4);//ab
		System.out.println(s3 == s4); //false
	
		//If we perform modification on string using String class methods, and if that object is changed as a result of that method call, new String object is created with that result. If we store that new object reference in reference variable, it is reachable else it is garbage collected. 
		
		//old string is modified => new string is created => its reference is not strored => s4 state is still ab only
		s4.concat("c");
		System.out.println(s4);//ab

		// Due to a String method call if String object is not changed, then the current String object refernece is returned
		
		//What is the output from the below program?
		String s5 = s4.concat("");
		System.out.println(s4); // ab
		System.out.println(s5); // ab
		System.out.println(s4 == s5); //true
*/
		//deleting trailing and leading spaces of a String
		//public String trim()  => it will not remove middle spaces

		String s1 = new String(" hari krishna "); 
		String s2 = s1.trim(); 

		System.out.println(s1); 
		System.out.println(s2);
		System.out.println(s1 == s2); 

		System.out.println(s1.length()); 
		System.out.println(s2.length());

		//What is the oupt from below program?
		String s3 = new String("Naresh i Technologies"); 
		String s4 = s3.trim(); 

		System.out.println(s3); 
		System.out.println(s4); 
		System.out.println(s3 == s4);

		//finding length of the given string, we should use below method
		//public int length()
/*
		String s1 = new String("Java Programming Language");
		int size = s1.length();
		System.out.println("lenth of s1 string: "+ size); 
		
		//print character of the given index, string index starts from ZERO, because its internal object is char array, should use below method.

		//public char chatAt(int index)
		System.out.println("character at 10th index in s1 string: "+ s1.charAt(10)); 

		//print all characters in given string with index, we should write our own logic with charAt() and length() methods
		for (int i = 0; i < size ; i++ )
		{
			System.out.println("character at index "+ i + "is : "+ s1.charAt(i)); 
		}
	*/	
		//Note: If we pass index out of range (index < 0 || index >= string.length()) to charAt() method it leads StringIndexOutOfBoundsException

		//In the above for loop if we keep condition i <= size, after printing all 25 characters JVM throws SIOBE for 25th index.
/*
		System.out.println(s1.charAt(0)); //=> J
		System.out.println(s1.charAt(10)); //=> a
		//System.out.println(s1.charAt(-10)); //=> SIOBE
		//System.out.println(s1.charAt(26)); //=> SIOBE
*/

		//Finding index of given character of String in the passed string, use below methods

		//below methods return first occurence of given character or String
			//public int indexOf(char ch)
			//public int indexOf(String str)
		
		//below methods return last occurence of given character or String
			//public int lastIndexOf(char ch)
			//public int lastIndexOf(String str)

		//below methods return first occurence of given character or String from the "biggining" from the given index 
			//public int indexOf(char ch, int fromIndex)
			//public int indexOf(String str, int fromIndex)

		//below methods return first occurence of given character or String from the "end to begin" from the given index 
			//public int lastIndexOf(char ch, int fromIndex)
			//public int lastIndexOf(String str, int fromIndex)
/*
		String s1 = new String("Java Programming Language");
		System.out.println(s1.indexOf('a')); //=> 1
		System.out.println(s1.lastIndexOf('a')); //=> 22
		System.out.println(s1.indexOf('a', 4)); //=> 10
		System.out.println(s1.lastIndexOf('a', 22)); //=> 22
		System.out.println(s1.lastIndexOf('a', 21)); //=> 18

		System.out.println(s1.indexOf("Programming")); //=> 1
		
		//the given char or string is not avialable in the current string, above methods return -1.
		System.out.println(s1.indexOf("hari")); //=> -1
		System.out.println(s1.indexOf('k')); //=> -1

	
		//write a program to find the given string or char available or not
		//until 1.4 version, we should a condition using indexOf() method to find string is available or not 
		//In 1.5 version, SUN introduced a method called "contains(String s)" to find string is available or not
		//It returns true if required string is available in given, else returns false.

		//check below methods definition given at end of the program
		findWithIndexOf("abcdef");
		findWithContains("abcdef");

		findWithIndexOf("asdfasdfsadf hari krishna asdfasdfsadf");
		findWithContains("asdfasdfsadf hari krishna asdfasdfsadf");
*/
		//replacing a character with new character, use methods of String class 
			//public String replace(char oldChar, char newChar)
			//public String replace(CharSequence oldString, CharSequence newString)
/*		String s1 = new String("Java Programming Language");
		String s2 = s1.replace('J', 'K');

		System.out.println("s1 String: "+s1);
		System.out.println("s2 String: "+s2);

		String s3 = s1.replace('a', 'A');
		System.out.println("s3 String: "+s3);
		
		String s4 = s1.replace("Programming", "Object-Oriented Programming");
		System.out.println("s4 String: "+s4);

		String s5 = "Ha Ha Ha";
		String s6 = s5.replace("Ha", "Hello");
		System.out.println("s5 String: "+s5);
		System.out.println("s6 String: "+s6);

		String s7 = s6.replace("hello", "Hi");
		System.out.println("s7 String: "+s7);

		//due to replace method call no change in current string, hence JVM returns same current string object reference.
		System.out.println(s6 == s7);//true
	*/	
		//converting all characters in string to upper or lower case
			//public String toUpperCase()
			//public String toLowerCase()
/*
		String s1 = "Hari Krishna";
		System.out.println(s1.toUpperCase()); //HARI KRISHNA
		System.out.println(s1.toLowerCase()); //hari krishna 
		System.out.println(s1); //Hari Krishna

		String s1 = "hari";
		String s2 = s1.toLowerCase();
		String s3 = s1.toUpperCase();
		System.out.println(s1); //hari
		System.out.println(s2); //hari
		System.out.println(s3); //HARI
		System.out.println(s1 == s2); //true
		System.out.println(s1 == s3); //false
*/		
		//startsWith() / endsWith()
		String s = "Java Programming Language";
/*

		System.out.println(s.startsWith("Java"));
		System.out.println(s.startsWith("java"));
		System.out.println(s.startsWith("hari"));

		System.out.println(s.endsWith("hari"));
		System.out.println(s.endsWith("Language"));
	*/	
		//isEmpty()
/*
		System.out.println(s.isEmpty());

		String s1 = "";
		String s2 = " ";
		String s3 = new String("");
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s3.isEmpty());
*/
		//substring()
/*
		System.out.println(s.substring(5,16));
		System.out.println(s.substring(s.indexOf("P"),s.indexOf(" L")));
		System.out.println(s.substring(s.indexOf("Language")));
	//	System.out.println(s.substring(16,5));
	//	System.out.println(s.substring(-1,5));
*/
		//split()
	/*
		String[] sarray = s.split(" ");
		int size	= sarray.length;
		for (int i = 0; i < size ; i++ )
		{
			System.out.println(i + " tocken is "+ sarray[i]);
		}
		*/
/*
		System.out.println("" + 10 + 20);
		System.out.println("" + "10" + 20);
		System.out.println("10" + 20);
		System.out.println("10" + "20");
		System.out.println("1020");
*/

	}

	static void findWithIndexOf(String originalString)
	{
		if(originalString.indexOf("hari") != -1)
		{
			System.out.println("The String hari is available ");
		}
		else
		{
			System.out.println("The String hari is not available ");
		}
	}

	static void findWithContains(String originalString)
	{
		if(originalString.contains("hari"))
		{
			System.out.println("The String hari is available ");
		}
		else
		{
			System.out.println("The String hari is not available ");
		}
	}
}
class Example
{
};
