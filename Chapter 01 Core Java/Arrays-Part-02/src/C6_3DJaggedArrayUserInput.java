import java.util.Scanner;

public class C6_3DJaggedArrayUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][][] arr = new int[3][][];
		arr[0] = new int[2][];
		arr[1] = new int[1][];
		arr[2] = new int[3][];
		
		arr[0][0] = new int[2];
		arr[0][1] = new int[1];
		
		arr[1][0] = new int[3];
		
		arr[2][0] = new int[1];
		arr[2][1] = new int[3];
		arr[2][2] = new int[4];
		
		System.out.println("Start...");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print("Enter  "+i+" "+j+" "+k+" :");
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("Array is : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k]+" ");
				}
			}
			System.out.println();
		}
	}

}
