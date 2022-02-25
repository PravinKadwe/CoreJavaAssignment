package FirstMethodVerifyBySecondMethod;

public class CallBySecondMethod {
	
	public int Add() {
		int a = 20;
		int b = 10;
		int c = a + b;
		return c;
	}
	
	public void verify() {
		int fetch1 = Add();
		
		System.out.println("Add() = "+ fetch1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallBySecondMethod obj = new CallBySecondMethod();
		
		obj.verify();

	}

}
