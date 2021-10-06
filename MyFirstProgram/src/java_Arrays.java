
public class java_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"}; // index starts at 0
		
		// make sure data types are consistent
		
		
		cars[0] = "Honda";
		
		System.out.println(cars[3]);
		
		String[] motor = new String[3];
		
		motor[0]= "yamaha";
		motor[1]= "kawasaki";
		motor[2]= "suzuki";
		
		for(int i=0; i<motor.length; i++) {
			
			System.out.println(motor[i]);
		}
	}

}
