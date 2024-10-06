class Cs3
{
	float add(float a, int b)
	{
		return a + b;
	}
	float add(int a, float b)
	{
		return a + b;
	}
}
public class C4_CodeSnippet_03_SameMethod_Ambiguity {

	public static void main(String[] args) {
		Cs3 obj = new Cs3();

//		Both the methods have the Ability to accept two integer Values
//		CE: Compiler gets Ambigious that whom to give
//		obj.add(10,20);
	}

}
