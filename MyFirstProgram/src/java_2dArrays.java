
public class java_2dArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	also known as Multidimensional arrays in java
		//	2Darray = an array of array
		
		
		// String[][] cars = new String[3][3]; another method
		
		String[][] cars = {{"Camaro","Corvette","Silverado"},
						   {"Mustang","Ford","Honda"},
						   {"Ferrari","Tesla","Lambo"}};
		
		
		/*cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		
		cars[1][0] = "Mustang";
		cars[1][1] = "Ford";
		cars[1][2] = "Honda";
		
		cars[2][0] = "Ferrari";
		cars[2][1] = "Tesla";
		cars[2][2] = "Lambo";
		*/
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+ " ");
				
			}
			
		}
		
		
	}

}
