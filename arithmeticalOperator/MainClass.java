package arithmeticalOperator;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("This is from main class");
		
		Calculator obj = new Calculator();
		
		int add = obj.Add();
		
		int sub = obj.Sub();
		
		int mul = obj.Mul();
		
		double div = obj.Div();
		
		System.out.println("Add() = "+ add);

		System.out.println("Sub() = "+ sub);
		
		System.out.println("Mul() = "+ mul);
		
		System.out.println("Div() = "+ div);



	}

}
