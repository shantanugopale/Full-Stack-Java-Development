import java.util.Scanner;

public class C1_ScannerClass {

	public static void main(String[] args) {
//		By using Scanner Class we can take input from the Console 
//		They Kept this Class inside a Util Package
//		for this we have create object of Scanner Class and by using that Object reference
//		We have to use it's Method which are Predefined.
//		Syntax : 
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter the No :");
			int no = sc.nextInt();
			System.out.println("Enter the Name :");
			String name = sc.next();
			System.out.println("No is : "+no+"\nName is: "+name);
	}

}
