import java.util.Scanner;
import java.util.InputMismatchException;

public class ch3_p4 {
	public static void main(String[] args) {
		String[] day = {"��", "��", "ȭ", "��", "��", "��", "��"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		try {
			int x = scanner.nextInt();
			if (x < 0) {
				System.out.print("���α׷��� �����մϴ�..");
				return;
			}
			
			System.out.print(day[x % 7]);
		} catch (InputMismatchException e) {
			System.out.print("���! ���� �Է����� �ʾҽ��ϴ�.");
		} finally {
			scanner.close();
		}
	}
}
