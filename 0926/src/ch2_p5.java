import java.util.Scanner;

public class ch2_p5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("논리 연산을 입력하세요 : ");
		System.out.println(scanner.nextBoolean());
		scanner.close();
	}
}
