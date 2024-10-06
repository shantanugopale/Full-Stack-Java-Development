class Calculator300
{
	int a,b,res;
	
	int calci() 
	{
		a = 10;
		b = 20;
		res =  a + b;
		return res;
	}
}
public class C4_03_DefaultMethodUsingReturn {

	public static void main(String[] args) {
		Calculator300 obj1 = new Calculator300();
		// if we return anything from method it depends on us whether catch it or no
//		System.out.println(obj1.calci()); 
		
		int ans = obj1.calci();
		System.out.println(ans);
	}

}
