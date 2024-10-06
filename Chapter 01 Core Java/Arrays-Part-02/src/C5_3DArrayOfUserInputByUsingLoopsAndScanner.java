import java.util.Scanner;

public class C5_3DArrayOfUserInputByUsingLoopsAndScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		|| College || Class || Students   ?
		System.out.println("Enter the no of College: ");
		int college = sc.nextInt();
		System.out.println("Enter the no of Class: ");
		int clas = sc.nextInt();
		System.out.println("Enter the no of Students");
		int students = sc.nextInt();
		
		int[][][] arr = new int[college][clas][students];
		System.out.println("Start :");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0 ;j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					System.out.println("Enter marks for College "+i+" Class "+j+" Student "+k);
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("Array is :");
		for(int i=0; i<college; i++)
		{
			for(int j=0 ;j<clas; j++)
			{
				for(int k=0; k<students; k++)
				{
					System.out.print(arr[i][j][k]+ " ");
				}
			}
			System.out.println();
		}
	}
}
