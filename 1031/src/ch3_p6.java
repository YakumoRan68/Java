import java.util.Scanner;

public class ch3_p6 {
	public static void main(String[] args) {
		String eng[] = {"student", "love", "java", "happy", "future" };
		String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
		Scanner scanner = new Scanner(System.in);
		String input;
		
		do {
			System.out.print("영어 단어를 입력하세요 : ");
			input = scanner.next();
			
			if (input.equals("exit")) break;
			
			Boolean found = false;
			for(int i = 0; i < eng.length; i++) {
				if(input.equals(eng[i])) {
					found = true;
					System.out.println(kor[i]);
					break;
				}
			}
			if(!found) System.out.println("그런 영어 단어가 없습니다.");
		} while (true);
		
		scanner.close();
		System.out.println("종료합니다...");
	}
}
