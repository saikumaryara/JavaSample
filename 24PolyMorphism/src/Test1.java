class Telugu{};
class Hindi{};
class English{};
class Tamil{};
class C{
	void wish(Telugu t) {
		System.out.println("C Telugu.wish()::Namaskar");
	}
	void wish(Hindi t) {//overloaded
		System.out.println("C Hindi.wish()::Namste");
	}

	void wish(English t) {//overloaded
		System.out.println("C English.wish()::Hi");
	}
}
class D extends C{
	void wish(English t) {//override
		System.out.println(" D English.wish()::Hi");
	}

	void wish(Tamil t) {//Normal method
		System.out.println("D Tamil.wish()::Vanakam");
	}

}
public class Test1 {
	public static void main(String[] arggs) {
		D d1=new D();
		d1.wish(new Telugu());
		d1.wish(new English());
		d1.wish(new Hindi());
		d1.wish(new Tamil());
		System.out.println();
		C c1=new C();
		c1.wish(new Telugu());
		c1.wish(new English());
		c1.wish(new Hindi());
		//c1.wish(new Tamil());
		C c2=new D();
		c2.wish(new Telugu());
		c2.wish(new English());
		c2.wish(new Hindi());
		//c2.wish(new Tamil());
		//C d2=new C();
		
	}
}
