class Calculator
{
	int a,b,c;
		
	void calci()
	{
		a = 10;
		b = 20;
		c = a + b;
		System.out.println("Addition is :"+c);
	}
}

public class C2_01_DefaultMethod {
		public static void main(String[] args) {
			Calculator obj1 = new Calculator();
			obj1.calci();
	}
}
