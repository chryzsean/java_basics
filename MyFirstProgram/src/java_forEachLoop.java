import java.util.ArrayList;



public class java_forEachLoop {
	
	public static void main(String[] args) {
		
		// for-each = 	traversing technique to iterate through the elements in an array/collection
		//				less steps, more readable
		//				less flexible
		
		
		//String[] animals = {"cat", "dog", "bird"};
		ArrayList<String> animals = new ArrayList<String>();
		
		
		animals.add("cat");
		animals.add("dog");
		animals.add("bird");
		animals.add("fish");
		
		
		for(String i : animals) { // : means "in"
			
			System.out.println(i);
			
		}
		
	}

}
