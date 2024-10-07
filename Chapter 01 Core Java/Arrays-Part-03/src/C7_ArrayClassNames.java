
public class C7_ArrayClassNames {
	public static void main(String[] args) {
		
		int[] a = new int[5];
		System.out.println(a.getClass().getName());
		
		int[][] b = new int[5][5];
		System.out.println(b.getClass().getName());
		
		double[][] c = new double[5][5];
		System.out.println(c.getClass().getName());
		
		char[][][] ch = new char[4][5][6];
		System.out.println(ch.getClass().getName());
		
		 /* [I
			[[I
			[[D
			[[[C
		 */
		
	}
}
