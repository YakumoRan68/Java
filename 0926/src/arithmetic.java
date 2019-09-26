import java.util.Scanner;

public class arithmetic {
	public static void main(String[] args) {
		System.out.println("식을 입력하세요 : ");
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
					System.out.println("0으로 나눌 수 없습니다.");
					return;
				}
				result = a / b;break;
			default : System.out.println("연산 기호가 잘못되었습니다."); return;
		}
		System.out.println("연산 결과 : " + result);
	}
}
