class Cs1
{
//	Gives Compile Time Error
//	int add(int a, int b)
//	{
//		return a + b;
//	}
//	
//	void add(int a, int b)
//	{
//		int res = a + b;
//		System.out.println(res);
//	}
	
	float add(float a, float b)
	{
		return a + b;
	}
}
public class C2_CodeSnippet_01 {

	public static void main(String[] args) {
		
		Cs1 obj = new Cs1();
		System.out.println(obj.add(10,20));
	}

}
