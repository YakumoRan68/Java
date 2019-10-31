import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ch3_p5 {
	public static void main(String[] args) {
		List<Integer> x = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(" ");
		
		System.out.print("정수 입력 : ");
		for (int i = 0; i < 10; i++) x.add(scanner.nextInt());
		scanner.close();
		
		x.sort(null);
		for (int i : x) System.out.print(i + " ");
	}
}
