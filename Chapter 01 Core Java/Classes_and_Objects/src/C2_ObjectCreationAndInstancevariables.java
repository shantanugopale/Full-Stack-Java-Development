class StudentData
{
	int id;
	String name;
	
	void Display()
	{
		System.out.println("Student ID is : "+id);
		System.out.println("Student Name is : "+name);
	}
}

public class C2_ObjectCreationAndInstancevariables {

	public static void main(String[] args) {
		
		StudentData stud1 = new StudentData();
		StudentData stud2 = new StudentData();
		
//		When we create an Object of Class, 
//		JVM Assigns the Default values to the Instance Variables by their Datatypes :-
//		int - 0, float - 0, String - null, char -  , boolean - false and so on...
		
		System.out.println(stud1.id); // Output:- 0
		System.out.println(stud1.name); // Output:- null
		
		stud1.id = 101;
		stud1.name = "Shantanu";
		
		stud2.id = 102;
		stud2.name = "Sushant";
		
		stud1.Display();
		stud2.Display();
		
	}

}
