class  Literal3
{
	 static  int[] i={10,20};
	 static  double[] d={10.0,20.0};
	 static  float[] f={10.0f,20.0f};
	 static char[] c={'s','a','i'};
	 static String[] str={"sai","kumar"};
    	static void m1(int[] i1){
		System.out.println("int[] type m1():"+i1[0]+""+i1[1]);
		}
		static void m1(double[] i1){
		System.out.println("double[] type m1():"+i1[0]+""+i1[1]);
		}
		static void m1(float[] i1){
		System.out.println("float[] type m1():"+i1[0]+""+i1[1]);
		}
		static void m1(char[] i1){
		System.out.println("char[] type m1():"+i1[0]+"  "+i1[1]+"  "+i1[2]);
		}
		static void m1(String[] i1){
		System.out.println("string[] type m1():"+i1[0]+""+i1[1]);
		System.out.println(java.util.Arrays.toString(i1));
		}
		public static void main(String[] args){
		  m1(i);
		  m1(d);
		  m1(f);
		  m1(c);
		  m1(str);
		}
}
