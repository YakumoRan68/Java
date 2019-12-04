import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ch7_p5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		System.out.println("���� �̸��� �α��� 5�� �Է��ϼ���. (��: Korea 5000)");
		for(int i = 0; i < 5; i++) {
			System.out.print("�����̸�, �α� >> ");
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
		
		System.out.println("���� �α��� ���� ����� (" + LargestKey + ", " + Largest + ")");
	}
}
