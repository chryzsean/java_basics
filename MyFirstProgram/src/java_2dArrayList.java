import java.util.*;
public class java_2dArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		
		bakeryList.add("Pandesal");
		bakeryList.add("Donut");
		bakeryList.add("Spanish bread");
		
		
		ArrayList<String> produceList = new ArrayList();
		
		produceList.add("Tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
	
		ArrayList<String> drinksList = new ArrayList();
		
		drinksList.add("Soda");
		drinksList.add("Coffee");
		
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);

	
		System.out.println(groceryList.get(2).get(1));
	}

}
