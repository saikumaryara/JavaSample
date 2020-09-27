class Example01 {
	static int a = 10;/*
						 * Here a variable is allowed to access only to class without class name.When we
						 * want to access staic a variable from out side of class We must use class
						 * name.var_name
						 */
	int x = 20;

	static void m1() {
		System.out.println(a);
		// System.out.println(x);//before object creation u cannot access non-static
		// varaible
		Example01 e1 = new Example01();
		System.out.println(e1.x);
	}

	void m2() {
		System.out.println(a);
		System.out.println(x);
	}

	static void m3() {
		System.out.println(a);
		// System.out.println(x);//Non-static variable cannot be referenced with static
		// context.
		// System.out.println(e1.x);//Here e1 obj is local to m1()
	}

	static void m4() {
		Example01 e1 = new Example01();
		System.out.println(e1.x);
	}
}

class VariableLS_AccessingRules {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// System.out.println(a);
		/*
		 * When we want to access staic a variable from out side of class We must use
		 * class name.var_name
		 */
		// System.out.println(x);
		System.out.println(Example01.a);
		// System.out.println(Example01.x);
		/*
		 * Here variable x is get memory only when obj is created and non-static variale
		 * is access only through obj reference
		 */
		Example01 e1 = new Example01();
		System.out.println(Example01.a);
		System.out.println(e1.x);
		Example01 e2 = null;
		System.out.println(Example01.a);
		// System.out.println(e2.x); RE: NPE
	}

	static void m1(int p) {
		System.out.println(p);
		// System.out.println(q);
		int q = 60;
		/*
		 * Here p,q variables are local to method u cannot access outside of method
		 */
		System.out.println(p);
		System.out.println(q);
		System.out.println(p);
		System.out.println(q);
	}

	static void m2() {
		// System.out.println(p);
		// System.out.println(q);
		/*
		 * Here p,q variables are local to method u cannot access outside of method
		 */
	}

	static void m3(int p) {
		int q = 60;
		System.out.println(p);
		System.out.println(q);
		if (p == 50) {
			int r = 70;
			System.out.println(p);
			System.out.println(q);
			System.out.println(r);
		}
		System.out.println(p);
		System.out.println(q);
		// System.out.println(r); CE: c f s
	}

//LV 3 rules in accessing
	static void m4() {
// System.out.println(m); //before declaration we can't access 
		int m = 30;
		System.out.println(m);
		int n;
// System.out.println(n); //variable is not initialized
		// LV does not default values or garbage values
		n = 50;
		System.out.println(n);
	}

	static void m5() {
		// System.out.println(n); //CE: c f s -- >one method's LV we can not access
		// in another method
	}
}