import java.util.Scanner;

public class ch4_p2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phone first = new Phone(scanner.next(), scanner.next());
		Phone second = new Phone(scanner.next(), scanner.next());
		
		System.out.print(first.getName() + "�� ��ȣ : " + first.getTel() + "\n" + second.getName() + "�� ��ȣ : " + second.getTel());
		scanner.close();
	}
}
