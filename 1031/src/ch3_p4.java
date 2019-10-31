import java.util.Scanner;
import java.util.InputMismatchException;

public class ch3_p4 {
	public static void main(String[] args) {
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		try {
			int x = scanner.nextInt();
			if (x < 0) {
				System.out.print("프로그램을 종료합니다..");
				return;
			}
			
			System.out.print(day[x % 7]);
		} catch (InputMismatchException e) {
			System.out.print("경고! 수를 입력하지 않았습니다.");
		} finally {
			scanner.close();
		}
	}
}
