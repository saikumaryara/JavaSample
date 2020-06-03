/*  Converting onte type of value to another type of value is called Type conversion
*    2 ways 1)= operator  2)cast operator
*   1)= operator:-Converting lower range type values to higher range type of values 
*   2)cast operator:-converting higher range type values to lower range type values only when the HRT value within in  the range of lower range type
*   byte < short < int < float < double 
*char> byte > short
*char < int
*/
class TypeConversion_01 
{
	 
	public static void main(String[] args) 
	{
		
	  byte b1=10;
      int i1=b1;//converting LRT to HRT and b1 range(byte)  is in the range of int
	  System.out.println(b1);
		System.out.println(i1);

		int i2=20;
      byte b2=(byte)i2;//converting HRT to LRT use cast operator and i2 range(int)i.e the value is in the range of byte if not the some value will loss
	  System.out.println(i2);
		System.out.println(b2);

	  int i3=1000;
      byte b3=(byte)i3;//here i3 range(int)i.e the value is not in the range of byte range
	  //so here no CE but lossing some value
	  /*  -128 + 0 + 127 =256 byte range 
	  1000-256=744
	  744-256=488
	  488-256=232
	  232-256=-24   -24 is in the range of byte
	  */
	  System.out.println(i3);
		System.out.println(b3);
		System.out.println(1000%256-256);

		float f4=1000.8f;
		int i4=(int)f4;//Here we are  loss  some value 0.8  is decreasing (i.e Norrowing)
		//suppose it will increase to 1001 (i.e Widening)
		System.out.println(f4);
		System.out.println(i4);

		double d1=1000.8;
		float f5=(float)d1;
		System.out.println(f5);
		System.out.println(d1);

		float f6=1000.8f;
		double d2=(double)f6;
		System.out.println(f6);
		System.out.println(d2);
		
		int i5=10;
		byte b4=(byte)(short)i5;
		System.out.println(i5);
		System.out.println(b4);

		int i6=97;
		byte b5=(byte)(short)(char)(double)i6;
		System.out.println(i6);
		System.out.println(b5);
        
	/*	int i7=97;
		byte b6=(byte)(short)(char)(boolean)(double)i7;//97.0 is not in boolean it leads to CE
		System.out.println(i7);
		System.out.println(b6);*/

        char ch1='a';
		char ch2=97;//char 0 to 65535 97->a ascii 0-255 unicode 0 to 65535
		System.out.println(ch1);
		System.out.println(ch2);

		char ch3=260;//it is in the of char but not in the range of ascii but in the range of unicode some symbol is come
		System.out.println(ch3);
		 
        int i8=98;
		int i9='b';
      	System.out.println(i8);
		System.out.println(i9);
      
	    char ch4='a';
		int i10=ch4;//here char <int Hrdt
		System.out.println(ch4);
		System.out.println(i10);//97
      
        char ch5=(char)i10;
		System.out.println(ch5);//a
	
	    int i11=-97;
	    char ch6=(char)i11;//here -97+65536=65439
	    System.out.println(i11);
	    System.out.println(ch6);
		char ch7='a';
		char ch8='1';
		char ch9=97;
		char ch10=1;
			    System.out.println(ch7);
			    System.out.println(ch8);
			    System.out.println(ch9);
			    System.out.println(ch10);
	      final int i12=10;
		  byte b7=i12;
		  System.out.println(i12);
		  System.out.println(b7);

		 /* final int i13=200;
		  byte b8=i13;//here CE because 200 is final so  the value is can't convert to lower
		  System.out.println(i13);
		  System.out.println(b8);*///CE possible lossy conversion if u remove final no CE


	
	
	}
}
