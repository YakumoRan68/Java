import java.util.Scanner;
import java.util.InputMismatchException;

public class ch3_p3 {
	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		
		try {
			x = scanner.nextInt();
		} catch(InputMismatchException e) {
			System.out.print("���� �Է����� �ʾ� �����մϴ�");
			return; // return�� �־ �ݵ�� finally�� �����.
		} finally {
			//System.out.print("�׽�Ʈ");
			scanner.close();
		}
		System.out.println((x % 2 == 1 ? "Ȧ" : "¦") + "��");
	}
}
