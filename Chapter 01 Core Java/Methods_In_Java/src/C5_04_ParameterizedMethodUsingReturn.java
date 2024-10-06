class Calculator400
{
	int res;
	
	int calci(int a, int b) 
	{
		a = 10;
		b = 20;
		res =  a + b;
		return res;
	}
}
public class C5_04_ParameterizedMethodUsingReturn {

	public static void main(String[] args) {
		
		Calculator400 obj = new Calculator400();
		// if we return anything from method it depends on us whether catch it or no
//		System.out.println(obj.calci(20, 50));
		int ans = obj.calci(20, 50);
		System.out.println(ans);
	}

}
