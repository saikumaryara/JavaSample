class WrapperClass02
{
  public static void main(String[] args){
   //  i:-)Converting PDT(primitive datatype to WCO(wc object)(i.e storing pv in WCO)

//   Integer io1=new Integer(5);//basically 5 is int type we are converting it into Integer
     //or//

	 Integer io1=Integer.valueOf(5);//recommonded to use this
   System.out.println(io1);//here our target is representing value as an object we can pass Integer type anywhere

   // Double do1=new Double(5.0);   //after 5.0v it is deprecated

    Double do1=new Double(5.0);//recommonded to use this
	System.out.println(do1);

    //Character co1=new Character('a');
	  Character co1=Character.valueOf('a');
	  System.out.println(co1);
   
    // Boolean bo1=new Boolean(true);
	  Boolean bo1=Boolean.valueOf(true);
       System.out.println(bo1);
/* Immutable object::-Once object is created we can't change it's content (i.e pooling is applied)
*  By default all WrapperClasses are Immutable objects Ex;-String.Integer,Long...
*Mutable Object::-The objects are allowed to change(i.e pooling is not applied)  Ex:StrinBuilder,java.util.Date...
* pooling is appiled only byte range(i.e value -128 to 127) only and boolean also
* i.e(here if you are assign two same values it will create only  1 object
* it will create 1 object-->return true otherwise false
*/
   Integer io2=Integer.valueOf(15);//here 15 is in the range of byte
   Integer io3=Integer.valueOf(15);
   System.out.println(io2==io3);//So only 1 object is created,so true will come here.

   Integer io4=Integer.valueOf(150);//here 150 is not in the range of byte
   Integer io5=Integer.valueOf(150);
   System.out.println(io4==io5);//so 2 object is created,so false will come here.
   
   /* From JAVA 5.0V  AutoBoxing(AB)::- AB Nothing But Converting PV to WCO directly without using Constructor(Integer.valueOf())
   *But The RULE is cnvrtg pv to wco ,wco is created based on value type, but not based on the assigned variable range type.
   *compiler internally creates object using valueOf()
   */
   Byte b1=5;//Byte b1=Byte.valueOf((byte)5);-->simly write like this Byte b1=5; from java5.0v
   Byte  b2=5;
   System.out.println(b1==b2);//Here 1 object create so true is come
   //Byte b3=150;//CE 150 not in the range of Byte
   Long l1=5L;
   Long l2=5L;
   System.out.println(b1==b2);//Here 1 object create so true is come
  // Long l3=5;//CE 5 not in the range of Long
  long l4=5;//no CE
   System.out.println(l4);
 // Float f1=10;//CE 10 not in the range of Float
 float f2=10;//no CE
  System.out.println(f2);
	 Boolean bo2=true;
	 Boolean bo3=true;
	   System.out.println(bo2==bo3);//Here 1 object create so true is come

  Boolean bo4=false;
	 Boolean bo5=false;
	   System.out.println(bo4==bo5);//Here 1 object create so true is come
  
    // Double d1=5;//CE  5 not in the range of Double
	double d2=5;
	 System.out.println(d2);
 System.out.println();
 /* ii-)Coverting WCO to PV (AutoUnboxing)
 (Retrieving pv from WCO)*/
 //Before JAVA5.0v
  int ia=io1.intValue();
   System.out.println(ia);

double da=do1.doubleValue();
 System.out.println(da);

 boolean ba=bo1.booleanValue();
 System.out.println(ba);

 char ca=co1.charValue();
 System.out.println(ca);

 byte by=io4.byteValue();
  System.out.println(by);
 short so=io4.shortValue();
  System.out.println(so);
 int in=io4.intValue();
  System.out.println(in);
 long lo=io4.longValue();
  System.out.println(lo);
 float fo=io4.floatValue();
  System.out.println(fo);
 double du=io4.doubleValue();
  System.out.println(du);
  //After java 5.0v
  int i7=io4;//internally [int i7=io4.intValue();]AutoUnboxing

  /* AutoBoxing-->REsult is WCO
     AutoUnboxing --->Result is PDV */

  /* We can't assign one pv to another pdt mapping
  * WC ref var_ (AB),it leads to CE where as we can assign one WCO to another PDT var_ but rule is */
 //  Integer 1o6='a';
 int i8='a';
 Character co2='a';
 int i9=co2;
    
	m1(12);
	m1(Integer.valueOf(12));
	//m1((byte)12);//CE
	//m1((short)12);//CE
	//m1((long)12);//CE
	m2(14);
	m2((byte)14);
	m2((short)14);
	//m2((long)12); long>int
  }
  static void m1(Integer i1){
   System.out.println(i1);
  }
  static void m2(int i1){
   System.out.println(i1);

   int i10=10;
   int i11=20;
   int i13=i10+i11;//perfomence best 

   Integer io6=10;
   Integer io7=20;
   Integer io8=io6+io7;//perfomence is low wcs

   // Where these wcs are used-->We are using Wcs in collections
   //because w ur passing pv as an object in collections only
   //AutoBoxing and AutoUnboxing are used in Collection topic

  }
}