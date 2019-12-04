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
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("emotion", "감정"));
		v.add(new Word("apple", "사과"));		
		v.add(new Word("banana", "바나나"));		
		v.add(new Word("painting", "그림"));		
		v.add(new Word("eye", "눈"));		
		v.add(new Word("society", "사회"));		
		v.add(new Word("fault", "오류"));		
		v.add(new Word("hospital", "병원"));		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("영어 어휘 테스트를 시작합니다. 1~4 외 다른 입력시 종료합니다.");
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
		System.out.println("프로그램을 종료합니다.");
	}
}
