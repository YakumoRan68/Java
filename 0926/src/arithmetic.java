import java.util.Scanner;

public class arithmetic {
	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		String op = scanner.next();
		double b = scanner.nextDouble();
		scanner.close();
		
		double result = 0;
		switch(op) {
			case "+" : result = a + b;break;
			case "-" : result = a - b;break;
			case "*" : result = a * b;break;
			case "/" : 
				if (b == 0) {
					System.out.println("0���� ���� �� �����ϴ�.");
					return;
				}
				result = a / b;break;
			default : System.out.println("���� ��ȣ�� �߸��Ǿ����ϴ�."); return;
		}
		System.out.println("���� ��� : " + result);
	}
}
