import java.util.Scanner;
import java.util.StringTokenizer;

public class ch6_p2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		do {
			String query = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(query, " ");
			if(query.equals("exit")) break;
			
			System.out.println("���� ������ " + st.countTokens());
			
		} while(true);
		
		scanner.close();
		System.out.println("�����մϴ�...");
	}
}
