package callByMainMethodWithParameter;

public class Calculator {
	
	public void Add(int a, int b) {
		int c = a + b;
		
		System.out.println("Add() = "+ c);
	}
	
	public void Sub(int a, int b) {

		int c = a - b;
		
		System.out.println("Sub() = "+ c);
	}
	
	public void Mul(int a, int b) {

		int c = a * b;
		
		System.out.println("Mul() = "+ c);
	}
	
	public void Div(double a, double b) {

		double c = a / b ;
		
		System.out.println("Div() = "+ c);
	}

}
