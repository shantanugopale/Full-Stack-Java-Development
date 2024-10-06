class Student // Blueprint of a Class called Student
{
	// HAS Part -> Variables
	int id;
	String name;
	
	// DOES Part -> Methods
	void playCricket()
	{
		System.out.println("Student is Playing Cricket");
	}
	
	void sleep()
	{
		System.out.println("Student is Sleeping");
	}
}

public class C1_ClassObjectStructure {
	// Driving Code -> Automatically Called by JVM
	public static void main(String[] args) {
		//	Creates an Object of Student Class
		Student obj1 = new Student();
	}

}
