
public class Test06_String_StringBuff_StringBuid_Relation {
	public static void main(String[] args) {
	String s1="sai";
  //StringBuffer s2="sai";
  //StringBuilder s3="sai";
	StringBuffer s2=new StringBuffer("sai");
	StringBuilder s3=new StringBuilder("sai");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	CharSequence cs1="NIT";
	CharSequence cs2=new StringBuffer("NIT");
	CharSequence cs3=new StringBuilder("NIT");
	System.out.println(cs1);
	System.out.println(cs2);
	System.out.println(cs3);
	m1(s1);
	m1(s2);
	m1(s3);
	}  
 //void m1(String s) { } //it allows only string type
    //void m1(StringBuffer s) {}//it allows only stringBuffer type
//void m1(StringBuilder s) {}///it allows only StringBuilder type
	
static void m1(CharSequence cs) {//U can pass any type of String
	System.out.println(cs);
}

}