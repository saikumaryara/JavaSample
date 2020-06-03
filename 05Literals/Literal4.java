class  Literal4
{
	    static void m1(int... i2){//want to pass multple values from method java 5v int...
		System.out.println("int... array  java5v type m1(): "+i2[0]+""+i2[1]+""+i2[2]);
		}
		static void m1(double... i2){
		System.out.println("double ... array  java5v type m1(): "+i2[0]+" "+i2[1]+" "+i2[2]);
		}
		static void m1(float... i2){
		System.out.println("float ... array  java5v type m1(): "+i2[0]+" "+i2[1]+" "+i2[2]);
		}
		static void m1(char... i2){
		System.out.println("string[] type m1(): "+i2[0]+" "+i2[1]+" "+i2[2]);
		}
        static void m1(String... i2){
		System.out.println("string... array java5v type m1(): "+i2[0]+" "+i2[1]+" "+i2[2]);
		}

	public static void main(String[] args) 
	{
		m1(5,6,7);
        m1(5.0,6.0,7.0);
        m1(5.0f,6.0f,7.0f);
        m1('$','@','I');
        m1("sai","kumar","yara");
	}
}
