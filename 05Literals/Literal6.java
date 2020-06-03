class Literal6{
	  static int m1(){
	  int i1=5;
	  return i1;
	 }
	  static int[] m2(){
	  int[] i2={5,6,7};
	  return i2;
	 }
	  static char[] m3(){
	  char[] i3={'$','@','I'};
	  return i3;
	 }
	 static String[] m4(){
	  String[] i4={"$@I","KUMAR","YARA"};
	  return i4;
	 }
	 public static void main(String[] args){
	              int i1=m1();
	              int[] i2=m2();
				  char[] i3=m3();
				  String[] i4=m4();
				  System.out.println(i1);
				  				  System.out.println(i2[0]+" ,"+i2[1]);
				  System.out.println(java.util.Arrays.toString(i2));
				  				  System.out.println(i3[0]+" "+i3[1]+" "+i3[2]);
				  System.out.println(i3);
				  System.out.println(java.util.Arrays.toString(i4));
				  System.out.println(i4[0]+" "+i4[1]+" "+i4[2]);


	 }
}