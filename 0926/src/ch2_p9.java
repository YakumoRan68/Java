import java.util.Scanner;

public class ch2_p9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99������ ������ �Է��ϼ��� : ");
		int num = scanner.nextInt();
		String str = "�ڼ�";
		for(int i = 10; i < num * 10; i *= 10) {
			str += num % i != 0 && num % i % 3 == 0 ? "¦" : "";
		}
		
		System.out.print(str.length() == 2 ? "�ڼ�����" : str);
		scanner.close();
	}

}
