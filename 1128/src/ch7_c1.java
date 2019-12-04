import java.util.Scanner;
import java.util.Vector;

class Word {
	String kor, eng;
	
	public Word(String han, String eng) {
		this.kor = han;
		this.eng = eng;
	}
}

public class ch7_c1 {
	static int MAX_QUESTION = 4;
	
	public static void main(String[] args) {
		Vector<Word> v = new Vector<Word>();
		v.add(new Word("love", "���"));
		v.add(new Word("animal", "����"));
		v.add(new Word("emotion", "����"));
		v.add(new Word("apple", "���"));		
		v.add(new Word("banana", "�ٳ���"));		
		v.add(new Word("painting", "�׸�"));		
		v.add(new Word("eye", "��"));		
		v.add(new Word("society", "��ȸ"));		
		v.add(new Word("fault", "����"));		
		v.add(new Word("hospital", "����"));		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ���� �׽�Ʈ�� �����մϴ�. 1~4 �� �ٸ� �Է½� �����մϴ�.");
		while(true) {
			Word question[] = new Word[MAX_QUESTION];
			for(int i = 0; i < MAX_QUESTION; i++) {
				question[i] = v.remove((int)(Math.random() * v.size()));
			}
			
			int answer = (int)(Math.random() * MAX_QUESTION);
			System.out.println(question[answer].eng + "?");
			
			String str = "";
			for(int i = 0; i < MAX_QUESTION; i++) {
				str += String.format("(%d) %s ", i + 1, question[i].kor);
			}
			System.out.println(str);
			
			int input;
			try {
				input = Integer.parseInt(scanner.next()); 
				if(input > MAX_QUESTION || input <= 0) break;
			} catch (Exception e) {
				break;
			}
			
			System.out.println(input - 1 == answer ? "Excellent !!" : "No. !!");
			
			for(Word i : question) {
				v.add(i);
			}
		}
		scanner.close();
		System.out.println("���α׷��� �����մϴ�.");
	}
}
