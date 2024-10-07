
public class C2_2DArrayForEachLoop {

	public static void main(String[] args) {
		
		int[][] arr = new int[][] {{1,2,3},{6,7,4},{3,4,2}};
		
		for(int[] a : arr)
		{
			for(int elements: a)
			{
				System.out.print(elements +" ");
			}
		}

	}

}
