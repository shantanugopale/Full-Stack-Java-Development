
// Q-> 3 Class have the Diff Diff Students ?
import java.util.Scanner;

public class C4_2DJaggedArrayOfUserInputByUsingLoopsAndScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];
		
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
