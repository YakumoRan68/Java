import java.util.Scanner;
import java.util.InputMismatchException;

public class ch3_p3 {
	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		try {
			x = scanner.nextInt();
		} catch(InputMismatchException e) {
			System.out.print("수를 입력하지 않아 종료합니다");
			return; // return이 있어도 반드시 finally가 실행됨.
		} finally {
			//System.out.print("테스트");
			scanner.close();
		}
		System.out.println((x % 2 == 1 ? "홀" : "짝") + "수");
	}
}
