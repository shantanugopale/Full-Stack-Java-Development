import java.util.Scanner;

public class C2_1DArrayOfUserInputByUsingLoopsAndScanner {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int[] arr = new int[5];
//		arrayName.length :- is the property which returns the length of an Array
		System.out.println("Enter the Array Elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
