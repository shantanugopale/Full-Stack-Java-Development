class Calculator200
{
	int res;
	void calci(int a, int b) // Parameters
	{
		res =  a + b;
		System.out.println("Result is :"+ res);
	}
}
public class C3_02_ParameterizedMethod {

	public static void main(String[] args) {
		
		Calculator200 obj1 = new Calculator200();
		obj1.calci(10,20);
		obj1.calci(30,20);
		obj1.calci(40,110);
	}

}
