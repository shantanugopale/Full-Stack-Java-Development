
public class C6_3DJaggedArraySyntax {

	public static void main(String[] args) {
		
		int[][][] arr = new int[4][][];
		arr[0] = new int[3][];
		arr[1] = new int[1][];
		arr[2] = new int[5][];
		arr[3] = new int[2][];
		
		arr[0][0] = new int[4];
		arr[0][1] = new int[2];
		arr[0][2] = new int[5];
		
		arr[1][0] = new int[3];
		
		arr[2][0] = new int[2];
		arr[2][1] = new int[1];
		arr[2][2] = new int[4];
		arr[2][3] = new int[3];
		arr[2][4] = new int[4];
		
		arr[3][0] = new int[4];
		arr[3][1] = new int[2];
		
		arr[1][0][0] = 76;
		
		System.out.println(arr[1][0][0]);

	}

}
