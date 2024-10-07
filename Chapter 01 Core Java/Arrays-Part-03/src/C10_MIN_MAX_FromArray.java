import java.util.Scanner;

public class C10_MIN_MAX_FromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		System.out.println("Enter the Elements of an Array : ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("MAX Value is : " + max);
		
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("MIN Value is : " + min);
		

	}

}
