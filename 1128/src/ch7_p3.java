import java.util.HashMap;
import java.util.Scanner;

public class ch7_p3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> list = new HashMap<String, Integer>();
		list.put("에스프레소", 2000);
		list.put("아메리카노", 2500);
		list.put("카푸치노", 3000);
		list.put("카페라떼", 3500);
		
		String KeyString = list.keySet().toString();
		System.out.println(KeyString.substring(1, KeyString.length() - 1) + " 있습니다.");
		
		while(true) {
			System.out.print("주문 >> ");
			String input = scanner.next();
			if (input.equals("그만")) break;
			
			System.out.println(input + "는 " + list.get(input) + "입니다.");
		}
		scanner.close();
	}
}
