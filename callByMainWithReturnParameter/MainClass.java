package callByMainWithReturnParameter;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calling Calcuator class from main class with parmeters.");
		
		Calculator obj = new Calculator();
		
		int a = 20;
		int b = 10;
		
		int add = obj.Add(a,b);
		
		int sub = obj.Sub(a,b);
		
		int mul = obj.Mul(a,b);
		
		double d = 20.25;
		double e = 10.15;
		
		double div = obj.Div(d,e);
		
		System.out.println("Add() = "+ add);

		System.out.println("Sub() = "+ sub);
		
		System.out.println("Mul() = "+ mul);
		
		System.out.println("Div() = "+ div);
		
		System.out.print("A"+"B"+'A');

	}

}
