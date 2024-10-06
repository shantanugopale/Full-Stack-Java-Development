
// In Jagged Array Size is not Fixed.
// Whose Size is not known leave it empty..

public class C5_2DJaggedArraySyntax {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[5];
		
		arr[0][0] = 87; 
		arr[0][1] = 65; 
		
		arr[1][0] = 87; 
		arr[1][1] = 43;
		arr[1][2] = 87;
		
		arr[2][0] = 87; 
		arr[2][1] = 43;
		arr[2][2] = 87; 
		arr[2][3] = 43;
		arr[2][4] = 87; 
		
		System.out.println(arr[0][1]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][2]);
	}

}
