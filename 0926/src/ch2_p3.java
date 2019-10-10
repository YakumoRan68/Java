import java.util.Scanner;

public class ch2_p3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값을 입력하세요 : ");
		int x = scanner.nextInt();
		System.out.print(x + "=" + x + " y=" + (int)(Math.pow(x, 2) - 3*x + 7));
		scanner.close();
	}
}
