package staticMethodCallByMainMathod;

public class MainClass {
	
	public static void staticMethod() {
		
		System.out.println("This String is call by Static Method!");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This String is printed by Main Method!\n");
		
		staticMethod();
	}

}
