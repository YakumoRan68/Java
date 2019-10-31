import java.util.Scanner;

public class ch2_p9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99사이의 정수를 입력하세요 : ");
		int num = scanner.nextInt();
		String str = "박수";
		for(int i = 10; i < num * 10; i *= 10) {
			str += num % i != 0 && num % i % 3 == 0 ? "짝" : "";
		}
		
		System.out.print(str.length() == 2 ? "박수없음" : str);
		scanner.close();
	}

}
