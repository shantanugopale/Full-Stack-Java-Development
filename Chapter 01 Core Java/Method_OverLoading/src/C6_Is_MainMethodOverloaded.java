
public class C6_Is_MainMethodOverloaded {

	public static void main(String[] args) {
		
		System.out.println("Actual Main Method");
//		just Passing the required Arguments Makes the Workm Done
		int[] a = {1,2,3,4};
		C6_Is_MainMethodOverloaded.main(a);
		C6_Is_MainMethodOverloaded.main(20.9);

	}
	
	public static void main(int[] args) {
			
		System.out.println("Integer Array Main Method");
	
	}
	
	public static void main(double d) {
		
		System.out.println("Double Main Method");
	
	}

}
