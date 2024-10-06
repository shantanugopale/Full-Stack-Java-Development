
public class C7_BufferOverRunAvoidedByException {

	public static void main(String[] args) {
// 		In Java Array is Secure by Contigous Memory Location
//		Array has Boundaries min and max if we manipulate out of memory then Exception throws at Runtime
//		So, there is no BufferOverRun Problem in Java like C Language
		int[] arr = new int[3];
		arr[0] = 7;
		arr[1] = 8;
		arr[2] = 9;
		
		arr[3] = 90; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		
		System.out.println("Statement after Array :");

	}

}
