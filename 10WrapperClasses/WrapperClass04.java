class WrapperClass04 
{
	public static void main(String[] args) 
	{
		/*iii)"5"-->5(PrimitiveStrinObject to PV)
		approach 1:)PSO to WCO to PV
		approach 2:)PSO to PV
         */
		// int i1="5"; CE
		 //int i2=(int)"5"; CE
		 String str="5";
		 Integer io1=Integer.valueOf(str);
		 int i3=io1.intValue();
		System.out.println("str:"+str);//here the value is Strng type
		System.out.println("io1:"+io1);//here the value is WCO type
		System.out.println("i3:"+i3);//here the value is int type
		System.out.println();

		//approach 2:)PSO to PV
       int i4=Integer.parseInt(str);
	   System.out.println(i4);////here the value is int type
	   byte b1=Byte.parseByte(str);
	    System.out.println(b1);////here the value is byte type

		short s1=Short.parseShort(str);
	    System.out.println(s1);////here the value is short type

		long l1=Long.parseLong(str);
	    System.out.println(l1);////here the value is long type

		double d1=Double.parseDouble(str);
	    System.out.println(d1);////here the value is double type

		 float f1=Float.parseFloat(str);
	    System.out.println(f1);////here the value is float type

		/*
		 * char c1=Character.parseCharacter(str.charAt(0));
		 * System.out.println(c1);////here the value is char type
		 */	}
}
