import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ch7_p6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> accounts = new HashMap<String, Integer>();
		
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			String name = scanner.next();
			if(name.equals("exit")) break;
			
			int point = scanner.nextInt();
			if(accounts.get(name) == null) accounts.put(name, point);
			else accounts.put(name, accounts.get(name) + point);
			
			String str = "";
			Set<String> keys = accounts.keySet();
			Iterator<String> it = keys.iterator();
			while(it.hasNext()) {
				String key = it.next();
				str += String.format("(%s, %d)", key, accounts.get(key));
			}
			System.out.println(str);
		}
		scanner.close();
		System.out.println("종료합니다...");
	}
}
