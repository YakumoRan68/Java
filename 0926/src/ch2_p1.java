import java.util.Scanner;

public class ch2_p1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		
		System.out.print("두 정수를 입력하세요 : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		
		System.out.println(a + "+" + b + "은 " + (int)(a+b));
		
	}
}
