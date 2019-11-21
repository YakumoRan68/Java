import java.util.Scanner;
import java.util.StringTokenizer;

public class ch6_p4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		String Formula = scanner.nextLine();
		StringTokenizer St = new StringTokenizer(Formula, "+");
		
		while(St.hasMoreTokens()) sum += Integer.parseInt(St.nextToken().trim());
		
		System.out.print("гую╨ " + sum);
		
		scanner.close();
	}
}
