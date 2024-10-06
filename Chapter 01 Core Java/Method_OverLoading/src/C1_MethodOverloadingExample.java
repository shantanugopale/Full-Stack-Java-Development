class Calculator
{
	int add(int a, int b)
	{
		return a + b;
	}
	
	int add(int a, int b, int c)
	{
		return a + b + c;
	}

	float add(int a, float b)
	{
		return a + b;
	}
	
	float add(float a, float b)
	{
		return a + b;
	}
	
	float add(int a, float b, float c)
	{
		return a + b + c;
	}
	
	double add(int a, int b, double c)
	{
		return a + b + c;
	}
	
	double add(double a, double b, double c)
	{
		return a + b + c;
	}
	
	double add(int a, double b, int c)
	{
		return a + b + c;
	}
	
}
public class C1_MethodOverloadingExample {

	public static void main(String[] args) {
		
		int a = 10, b = 20, c = 30;
		float m = 10.5f, n = 20.11f, o = 34.4f;
		double x = 15.5,y = 25.5,z = 35.5;
		
		Calculator obj = new Calculator();
		System.out.println(obj.add(a, b));
		System.out.println(obj.add(a, b, c));
		System.out.println(obj.add(a, m));
		System.out.println(obj.add(m, n));
		System.out.println(obj.add(a, m, n));
		System.out.println(obj.add(a, b, x));
		System.out.println(obj.add(x, y, z));
		System.out.println(obj.add(a, x, b));
	}

}
