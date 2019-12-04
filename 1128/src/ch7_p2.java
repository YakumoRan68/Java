import java.util.Scanner;
import java.util.Vector;

public class ch7_p2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Character> grade = new Vector<Character>();
		
		for(int i = 0; i < 5; i++) {
			char input = scanner.next().charAt(0);
			grade.add(input);
		}
		scanner.close();
		
		String str = "";
		for(char c : grade) str += (c == 'A' ? "4.0" : c == 'B' ? "3.0" : c == 'C' ? "2.0" : c == 'D' ? "1.0" : c == 'F' ? "0.0" : "?") + " ";
		System.out.println(str);
	}

}
