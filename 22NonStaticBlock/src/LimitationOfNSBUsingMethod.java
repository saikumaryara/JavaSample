
public class LimitationOfNSBUsingMethod {
	private boolean executed = false;

	void wish(){//Werever wwe need we can execute method.sometime not allowed if already executed.
		if(executed)
			throw new IllegalStateException("Already wished");
		
		System.out.println(" Hello");
		executed = true;
	}
	LimitationOfNSBUsingMethod(){
		System.out.print("NPC");
		wish();
	}
	LimitationOfNSBUsingMethod(int x){
		System.out.print("IPC");
		wish();
	}
	LimitationOfNSBUsingMethod(String s){
		System.out.print("SPC");
		wish();
	}
}

class Test55_NSB_TC4_0_5 {
	public static void main(String[] args) {
		LimitationOfNSBUsingMethod e1 = new LimitationOfNSBUsingMethod();	
		LimitationOfNSBUsingMethod e2 = new LimitationOfNSBUsingMethod(5);	
		LimitationOfNSBUsingMethod e3 = new LimitationOfNSBUsingMethod("a");	
		e1.wish();

	}
}

