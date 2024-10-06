

// In array we can create collection of objects, primitive values or any type of collection 
// but, it should be similar types.
class Fan
{
	int cost;
	String fanCompany;
}
public class C9_ArrayOfUndefinedClassObjects {

	public static void main(String[] args) {
		
		Fan[] f = new Fan[3]; // one array is created in heap and refernce is f
		f[0] = new Fan();     // inside index object is created and allocates the default values to instance variables
		f[1] = new Fan();
		f[2] = new Fan();
		
		f[0].cost = 7234;
		f[2].fanCompany = "Samsung";

	}

}
