import java.util.Scanner;

public class ch3_p6 {
	public static void main(String[] args) {
		String eng[] = {"student", "love", "java", "happy", "future" };
		String kor[] = {"�л�", "���", "�ڹ�", "�ູ��", "�̷�"};
		Scanner scanner = new Scanner(System.in);
		String input;
		
		do {
			System.out.print("���� �ܾ �Է��ϼ��� : ");
			input = scanner.next();
			
			if (input.equals("exit")) break;
			
			Boolean found = false;
			for(int i = 0; i < eng.length; i++) {
				if(input.equals(eng[i])) {
					found = true;
					System.out.println(kor[i]);
					break;
				}
			}
			if(!found) System.out.println("�׷� ���� �ܾ �����ϴ�.");
		} while (true);
		
		scanner.close();
		System.out.println("�����մϴ�...");
	}
}
