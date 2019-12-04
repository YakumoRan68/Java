import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ch7_p5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");
		for(int i = 0; i < 5; i++) {
			System.out.print("나라이름, 인구 >> ");
			nations.put(scanner.next(), scanner.nextInt());
		}
		scanner.close();
		
		Set<String> keys = nations.keySet();
		Iterator<String> it = keys.iterator();
		int Largest = 0;
		String LargestKey = "";
		while(it.hasNext()) {
			String key = it.next();
			int num = nations.get(key);
			if(Largest < num) {
				LargestKey = key;
				Largest = num;
			}
		}
		
		System.out.println("제일 인구가 많은 나라는 (" + LargestKey + ", " + Largest + ")");
	}
}
