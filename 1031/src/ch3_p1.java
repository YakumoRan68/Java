import java.util.Scanner;

public class ch3_p1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("¾ËÆÄºª ÀÔ·Â : ");
		
		String str = scanner.next();
		for(char i = str.charAt(0); i >= 'a' ; i--) {
			for (char j = 'a'; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}
		
		scanner.close();
	}
}
