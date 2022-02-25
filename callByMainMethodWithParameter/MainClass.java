package callByMainMethodWithParameter;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calling Calcuator class from main class with parmeters.");
		
		Calculator obj = new Calculator();
		
		int a = 20;
		int b = 10;
		
		obj.Add(a,b);
		
		obj.Sub(a,b);
		
		obj.Mul(a,b);
		
		double d = 20.25;
		double e = 10.15;
		
		obj.Div(d,e);
		
		

	}

}
