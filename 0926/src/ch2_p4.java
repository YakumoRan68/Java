import java.util.Scanner;

public class ch2_p4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y;
		
		System.out.print("�� x,y�� ��ǥ�� �Է��ϼ��� : ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println("��(" + x + ", " + y + ")�� (50, 50)�� (100, 100)�� �簢�� ���� " + (x >= 50 && x <= 100 && y >= 50 && y <= 100 ? "��" : "��") + "���ϴ�." );
		scanner.close();
	}
}
