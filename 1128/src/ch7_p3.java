import java.util.HashMap;
import java.util.Scanner;

public class ch7_p3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> list = new HashMap<String, Integer>();
		list.put("����������", 2000);
		list.put("�Ƹ޸�ī��", 2500);
		list.put("īǪġ��", 3000);
		list.put("ī���", 3500);
		
		String KeyString = list.keySet().toString();
		System.out.println(KeyString.substring(1, KeyString.length() - 1) + " �ֽ��ϴ�.");
		
		while(true) {
			System.out.print("�ֹ� >> ");
			String input = scanner.next();
			if (input.equals("�׸�")) break;
			
			System.out.println(input + "�� " + list.get(input) + "�Դϴ�.");
		}
		scanner.close();
	}
}
