import java.util.Scanner;

abstract class Calculator {
	protected int a, b;
	abstract protected int calc();
	protected void input(Scanner scanner) {
		System.out.print("���� 2���� �Է��ϼ��� : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}
	public void run(Scanner scanner) {
		input(scanner);
		int res = calc();
		System.out.println("���� ���� " + res);
	}
}

class Adder extends Calculator {
	public int calc() {
		return a + b;
	}
}

class Subtracter extends Calculator {
	public int calc() {
		return a - b;
	}
}

public class ch5_p3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		
		adder.run(scanner);
		sub.run(scanner);
		
		scanner.close();
	}
}
