import java.util.ArrayList;
public class java_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList = 	a resizable array. 
		//				Elements can be added and removed after compilation phase
		//				store reference data types
		
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Hamburger");
		food.add("Hotdog");
		
		//other useful methods
		food.set(0, "sushi"); // replay index 0 with sushi
		food.remove(2); // remove element number 2 or index number 2 which is hotdog
		food.clear(); // cleared all the elements in the ArrayList
		
		
		for(int i=0; i<food.size(); i++) { //use .size instead of .length when using ArrayList
			System.out.println(food.get(i));  // inorder to retreive elements, use get function
		}
	}
	

}
