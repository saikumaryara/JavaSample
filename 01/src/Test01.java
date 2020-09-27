
public class Test01 {
   public static void main(String[] args) {
	   AA a1=new AA();
	   BB b1=new BB();
	   System.out.println(a1);
   }
}
class AA{int x=10; /*@Override public String toString() {return ""+x;}*/}
class BB{int y=10; @Override public int hashCode() {return y;}}
