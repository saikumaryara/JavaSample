class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		//1. append

/*
		public StringBuffer append(xxx value)
		Where xxx is data type
		
		Ex:
		public StringBuffer append(boolean value)
		public StringBuffer append(int value)
		public StringBuffer append(String value)
			.....
			.....
			.....
*/
		StringBuffer sb1  = new StringBuffer("abc");
		StringBuffer sb2  = sb1.append("d");

		System.out.println(sb1);//abcd
		System.out.println(sb2);//abcd
		System.out.println(sb1 == sb2);//true

		//insert
		//public StringBuffer insert(int offset, xxx value)
		//Where xxx is data type

		StringBuffer sb = new StringBuffer("2942011");

		System.out.println(sb);// 2942011
		sb.insert(2, "/");
		System.out.println(sb);// 29/42011

		sb.insert(4, "/");
		System.out.println(sb);// 29/4/2011

		//delete
//		public StringBuffer delete(int start,int end)
//		public StringBuffer deleteCharAt(int index)
		
		StringBuffer sb3 = new StringBuffer("Hari xyz Krishna");

		System.out.println(sb3);//Hari xyz Krishna

		sb3.delete(sb3.indexOf("xyz") , sb3.indexOf("xyz") +"xyz".length() );
		//sb3.delete(5, 5 +3 );
		//sb3.delete(5, 8 );
		
		System.out.println(sb3); //Hari  Krishna

		sb3.deleteCharAt(4);
		sb3.deleteCharAt(4);
		System.out.println(sb3); //HariKrishna

		//reverse
		//public StringBuffer reverse()

		StringBuffer sb4 = new StringBuffer("abc");
		System.out.println(sb4); //abc

		sb4.reverse();
		System.out.println(sb4); //cba

		//capacity() and length()
		//public int capacity()
		//public int length()

		StringBuffer sb5 = new StringBuffer(); 
		System.out.println(sb5);//
		System.out.println(sb5.capacity());//16
		System.out.println(sb5.length());//0

		sb5.insert(0,"abc");
		System.out.println(sb5);//abc
		System.out.println(sb5.capacity());//16
		System.out.println(sb5.length());//3


		StringBuffer sb6 = new StringBuffer("abc"); 
		System.out.println(sb6);//abc
		System.out.println(sb6.capacity());//19
		System.out.println(sb6.length());//3


	}
}