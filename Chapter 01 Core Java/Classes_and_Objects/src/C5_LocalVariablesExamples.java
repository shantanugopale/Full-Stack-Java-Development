
public class C5_LocalVariablesExamples {
	public static void main(String[] args) {
		int i = 0;
		for(int j = 0; j<3; j++)
		{
			i = i + j;
		}
		System.out.println(i);
//		System.out.println(j); CE: j is not declared.
		
//		int a = Integer.parseInt("ten"); RuntimeException	
	}
}
