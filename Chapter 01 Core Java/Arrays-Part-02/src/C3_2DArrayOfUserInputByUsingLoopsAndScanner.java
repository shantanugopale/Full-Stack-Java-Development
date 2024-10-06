import java.util.Scanner;

public class C3_2DArrayOfUserInputByUsingLoopsAndScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Row-Size of an Array :");
		int rows = sc.nextInt();
		System.out.println("Enter the Row-Size of an Array :");
		int cols = sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		System.out.println("Enter Elements of an Array :");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array Elements are :");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
