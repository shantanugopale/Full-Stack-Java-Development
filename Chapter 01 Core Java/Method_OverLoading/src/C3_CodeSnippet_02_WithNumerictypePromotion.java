class Cs2
{
	float add(int a, float b)
	{
		return a + b;
	}
}

public class C3_CodeSnippet_02_WithNumerictypePromotion {

	public static void main(String[] args) {
		Cs2 obj = new Cs2();
//		Implicit TypeCasting will happen
		System.out.println(obj.add(10, 20));
	}

}
