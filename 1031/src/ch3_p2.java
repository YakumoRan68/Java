import java.util.Scanner;

public class ch3_p2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(" ");
		
		System.out.print("정수 입력 : ");
		while(scanner.hasNext()) {
			int a = scanner.nextInt();
			if (a % 3 == 0) System.out.print(a + " ");
		}
		
		scanner.close();
	}
}
