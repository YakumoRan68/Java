import java.util.Scanner;

public class ch4_p2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phone first = new Phone(scanner.next(), scanner.next());
		Phone second = new Phone(scanner.next(), scanner.next());
		
		System.out.print(first.getName() + "의 번호 : " + first.getTel() + "\n" + second.getName() + "의 번호 : " + second.getTel());
		scanner.close();
	}
}
