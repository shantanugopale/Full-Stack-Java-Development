class Display
{
	void show()
	{
		System.out.println("iNeuron");
	}
	
	void show(String name)
	{
		System.out.println("Name :"+name);
	}
	
	void show(int age)
	{
		System.out.println("Age :"+age);
	}
}

public class C5_CodeSnippet_04_NormalMethodOverloading {

	public static void main(String[] args) {
		
		Display disp = new Display();
		disp.show();
		disp.show("Shantanu");
		disp.show(22);
	}

}
