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

		StringBuffer sb1  = new StringBuffer("abc");
		StringBuffer sb2  = sb1.append("d");

		System.out.println(sb1);//abcd
		System.out.println(sb2);//abcd
		System.out.println(sb1 == sb2);//true
*/
		//insert
		//public StringBuffer insert(int offset, xxx value)
		//Where xxx is data type
/*
		StringBuffer sb = new StringBuffer("2942011");

		System.out.println(sb);// 2942011
		sb.insert(2, "/");
		System.out.println(sb);// 29/42011

		sb.insert(4, "/");
		System.out.println(sb);// 29/4/2011
*/
		//delete
//		public StringBuffer delete(int start,int end)
//		public StringBuffer deleteCharAt(int index)
/*		
		StringBuffer sb = new StringBuffer("Hari xyz Krishna");

		System.out.println(sb);//Hari xyz Krishna

		sb.delete(sb.indexOf("xyz") , sb.indexOf("xyz") +"xyz".length() );
		//sb.delete(5, 5 +3 );
		//sb.delete(5, 8 );
		
		System.out.println(sb); //Hari  Krishna

		sb.deleteCharAt(4);
		sb.deleteCharAt(4);
		System.out.println(sb); //HariKrishna
*/
		//reverse
		//public StringBuffer reverse()
/*
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb); //abc

		sb.reverse();
		System.out.println(sb); //cba
*/
		//capacity() and length()
		//public int capacity()
		//public int length()

		StringBuffer sb1 = new StringBuffer(); 
		System.out.println(sb1);//
		System.out.println(sb1.capacity());//16
		System.out.println(sb1.length());//0

		sb1.insert(0,"abc");
		System.out.println(sb1);//abc
		System.out.println(sb1.capacity());//16
		System.out.println(sb1.length());//3


		StringBuffer sb2 = new StringBuffer("abc"); 
		System.out.println(sb2);//abc
		System.out.println(sb2.capacity());//19
		System.out.println(sb2.length());//3


	}
}