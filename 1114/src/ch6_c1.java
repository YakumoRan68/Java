import java.util.Scanner;

public class ch6_c1 {
	static String readString() {
		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while(true) {
			String line = scanner.nextLine();
			if (line.equals(";")) break;
			sb.append(line);
		}
		scanner.close();
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String text = readString().toUpperCase();
		final short A = 65;
		int[] result = new int[26];
		
		for(int i = 0; i < text.length(); i++) {
			int c = text.charAt(i);
			if(c >= A && c <= A + 26) result[c-A]++;
		}
		
		System.out.println("\n히스토그램을 그립니다.");
		StringBuilder s = new StringBuilder();
		
		short x = A;
		for(int i : result) {
			s.delete(0, s.length());
		
			s.append((char)x++ + "(" + i + ") ");
			for(int j = 0; j < i; j++) s.append("-");
			System.out.println(s);
		}
	}
}
