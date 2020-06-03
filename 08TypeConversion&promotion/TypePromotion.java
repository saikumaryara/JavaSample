/*TypePromotion::converting lower range datatype value(LRDTV) to Higher range
* datatype value(HRDTV) is called TypePromotion /auto conversion/widening/imlpicit conversion/upcasting
* byte+byte=int
* short +short=int
* char+char=int
* int+int=int
* long+long=long
* float+float=float
* double+double=double
* boolean+boolean=CE
* int+long=long
* long+float=float
* float+double=double
* long+double=double
* byte+short+int=int  //here byte+short=short --> short+int=int
* byte+short+char+float=float  //here byte+short= short and char+float= float --->short+float=float
*/
class TypePromotion{
   public static void main(String[] args){
    int i1=10;
	long l1=i1;
	float f1=i1;
	System.out.println(i1);
	System.out.println(l1);
	System.out.println(f1);
	System.out.println(10+20.0);//here 10 is int 20.0 is double double HRDTV > int LRDTV //int 10 is promoted to double type 10.0
	System.out.println(20+20.0f);
	//float f2=40+20.0;//CE because double 20.0 is > HRDTV float LRDTV
    double d1=40+20.0;
    	System.out.println(d1);

	byte b1=10;
	byte b2=20;
//	byte b3=b1+b2;// byte+byte=int CE or 
   int i2=b1+b2;
   System.out.println(i2);
   byte b4=10+20;//the compiler will is consider value
  // byte b5=10+120;//value is not in the range of byte
 //  byte b6=10L+20;//CE long > byte
     byte b7=(int)10L+20;
	 long l2=10L;
	// byte b8=l2+20;//CE long + int =long
	//byte b9=(int)l2+20;//CE possible lossy conversion 
	int i3=(int)l2+20;// (int)l2 =int --> int +int=int
   }
}