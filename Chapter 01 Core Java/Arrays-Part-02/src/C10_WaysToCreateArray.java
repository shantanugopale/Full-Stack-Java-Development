
public class C10_WaysToCreateArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6};
		
		char ch[] = {'a','b','c'};
		
		int b[] = new int[5];
		
		int[] c= new int[4];
		
//		1D
		int[] d = new int[] {3,4,5,6,7,8};
		
//		2DRegular
		int[][] e = new int[][] {{1,2},{3,4},{5,6}};
		
//		2DJagged
		int[][] f = new int[][] {{1,2,3},{4,5}};
		
//		3DRegular
		int[][][] g = new int[][][] {{{1,2,3},{4,5,6},{7,8,9}}};
		
//		3DJaggeds
		int[][][] h = new int[][][] {{{3,4},{5,6,7},{7,8,9,5}}};
	}
}
