
public class C9_SumOfAllElementsOfAnArray {

	public static void main(String[] args) {
		
		int[] arr = {6,7,8,94,3,2};
		
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum  = sum + arr[i];
		}
		System.out.println("SUM is : "+sum);
	}

}
