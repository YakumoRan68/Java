import java.util.Scanner;
import java.util.Vector;

public class ch7_p1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Double> Doubles = new Vector<Double>();
		
		Double Largest = -Double.MAX_VALUE;
		for(int i = 0; i < 5; i++) {
			Double input = scanner.nextDouble();
			Largest = Largest < input ? input : Largest;
			Doubles.add(input);
		}
		scanner.close();
		
		System.out.println("가장 큰 수는 " + Largest);
	}

}
