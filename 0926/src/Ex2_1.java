import java.util.Scanner;

public class Ex2_1 {
	public static void main(String args[]) {
		System.out.println("두 정수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = a+b;
		System.out.println(a + " + " + b + " = " + sum);
		scanner.close();
	}
}
