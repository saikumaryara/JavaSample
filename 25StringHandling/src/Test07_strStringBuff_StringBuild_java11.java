import java.util.Comparator;
import java.util.TreeSet;

public class Test07_strStringBuff_StringBuild_java11 {
	 public static void main(String[] args) {
		 TreeSet<String> ts1=new TreeSet<>();
		 ts1.add("a");
		 ts1.add("b");
		 System.out.println(ts1);
		/* TreeSet<StringBuilder> ts2=new TreeSet<>();//StringBuff,StringBuilder 
		 //not sub class of comparabe interface upto java 11 so CE:ClasscastException
		 ts2.add(new StringBuilder("a"));
		 ts2.add(new StringBuilder("b"));
		 System.out.println(ts2);*/
   //Soltion is use java 11v or bellow code
		    TreeSet<String> ts2=new TreeSet<>();
			 ts2.add(new StringBuilder("a").toString());
			 ts2.add(new StringBuilder("b").toString());
			 System.out.println(ts2);//but here Strings are stored
			 //I want to store StrinBuilder type objects so write bellow SBComparator class code 

			 //Java 1.0 explicit sub class
			 TreeSet<StringBuilder> ts3=new TreeSet<>(new SBComparator());
			 ts3.add(new StringBuilder("a"));
			 ts3.add(new StringBuilder("b"));
			 System.out.println(ts3);
			 //From java 11v onwards easily write
			 /* TreeSet<StringBuilder> ts5=new TreeSet<>();
			 ts5.add(new StringBuilder("a"));
			 ts5.add(new StringBuilder("b"));
			 System.out.println(ts5);*/
			  
	 }
}
class SBComparator implements Comparator<StringBuilder>{

	@Override
	public int compare(StringBuilder sb1, StringBuilder sb2) {
      String s1=sb1.toString();
      String s2=sb2.toString();
      
		return s2.compareTo(s1);//for reverse order
	}
}