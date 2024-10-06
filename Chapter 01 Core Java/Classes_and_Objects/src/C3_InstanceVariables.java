
public class C3_InstanceVariables {

	int i = 10; // instance variable
	public static void main(String[] args) {
		
//		System.out.println(i); CE : instance variable can't be accessed directly in static context
		
		// Object created
		C3_InstanceVariables obj = new C3_InstanceVariables();
//		i=10 is stored in heap area
		System.out.println(obj.i); // 10
		
//		***Inside instance method, instance variables can be accessed
	}

}
