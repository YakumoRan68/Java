import java.util.Scanner;

public class ch2_p7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학점을 입력하세요 : ");
		String a = scanner.next();	
		switch(a) {
			case "A" : case "B" :
				System.out.print("Excellent");
				break;
			case "C" : case "D" :
				System.out.print("Good");
				break;
			case "F" :
				System.out.print("Bye");
				break;
			default :
				System.out.print("올바르지 않은 입력");
		}
		scanner.close();
	}
}
