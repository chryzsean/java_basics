import java.util.Random; //access to random class

public class Java_random_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(); // Pseudo random
		
		
		// int x = random.nextInt(6)+1;//add +1 to output 1-6 if not, only 1-5 will be outputed
		
		//double y = random.nextDouble(); // with decimal point
		
		boolean z = random.nextBoolean(); // True or False only
		
		System.out.println(z);
		
	}

}
