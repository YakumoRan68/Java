import java.util.Scanner;

public class ch2_p2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 층인지 입력하세요 : ");
		System.out.print(scanner.nextInt() * 5 + "입니다.");
		scanner.close();
	}
}
