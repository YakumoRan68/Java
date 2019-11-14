import java.util.Scanner;

abstract class Calculator {
	protected int a, b;
	abstract protected int calc();
	protected void input(Scanner scanner) {
		System.out.print("정수 2개를 입력하세요 : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}
	public void run(Scanner scanner) {
		input(scanner);
		int res = calc();
		System.out.println("계산된 값은 " + res);
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
