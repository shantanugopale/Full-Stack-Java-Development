
public class Test {

	public static void main(String[] args) {
		int[] arr = {1,98,95,35,29,20,24,26,21,67,76};
		int temp=0;
		int count=0;
		for(int i=0;i<arr.length/2;i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		   
		}
       
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
