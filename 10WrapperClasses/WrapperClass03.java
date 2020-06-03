import java.util.ArrayList;
class WrapperClass03 
{
	public static void main(String[] args) 
	{

		 // Where these wcs are used-->We are using Wcs in collections
   //because w ur passing pv as an object in  only collections
   //AutoBoxing and AutoUnboxing are used in Collection topic.
   //suppose ur adding pv in an array that is fixed
   int[] ia=new int[3];
   ia[0]=10;
   ia[1]=20;
   ia[2]=30;
  // int[3]=40;//CE because int[] is not growable it is fixed length.
		System.out.println(); 
//AutoBoxing upto java 1.4v
	//Storing
		ArrayList al=new ArrayList();
		al.add(new Integer(2));//Here i am passing pv as an object
		al.add(new Integer(3));
		al.add(new Integer(4));//like N no.of ojects we can add it is growable
  //retrieving upto 1.4v
     Object obj=al.get(0);
	 Integer io1=(Integer)obj;
	 int i1=io1.intValue();
	 Object obj1=al.get(1);
	 Integer io2=(Integer)obj1;
	 int i2=io2.intValue();
	 Object obj2=al.get(2);
	 Integer io3=(Integer)obj2;
	 int i3=io3.intValue();
	
			System.out.println(i1);
			System.out.println(i2);
			System.out.println(i3);
			System.out.println();
     //After 5.0v AutoBoxing
	 al.add(2);
	 al.add(3);
	 al.add(4);
  //retrieving after 1.4v AutoUnBoxing
   int i4=(int)al.get(0);//0 is index number
   int i5=(int)al.get(1);//1 is index number
   int i6=(int)al.get(2);//2 is index number 
	System.out.println(i4);
			System.out.println(i5);
			System.out.println(i6);
	}
}
