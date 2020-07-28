class SuperClass{
	SuperClass(){
		this(5);
		System.out.println("SuperClass no-arg");
	}
	SuperClass(int a){
		this("a");
		System.out.println("SuperClass int-arg");
	}
	SuperClass(String s){
		
		System.out.println("SuperClass String-arg");
	}
}
class SubClass extends SuperClass{
		SubClass(){
			this(5);
			System.out.println("SubClass no-arg");
		}
		SubClass(int a){
			this("a");
			System.out.println("SubClass int-arg");
		}
		SubClass(String s){
			//compiler place internally super();
			System.out.println("SubClass String-arg");
		}
}
public class Constructor_chaining01 {
  public static void main(String[] args) {
	  new SubClass();
	  System.out.println();
	  new SubClass(5);
	  System.out.println();
	  new SubClass("a");
  }
}
