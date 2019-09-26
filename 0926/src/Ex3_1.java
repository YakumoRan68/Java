import java.util.Scanner;

public class Ex3_1 {
	public static void main(String[] args) {
		int Arr[] = new int[10];
		String result = "";
		
		System.out.println("정수 10개 입력 : ");
		Scanner scanner = new Scanner(System.in);
		for(int i : Arr) {
			Arr[i] = scanner.nextInt();
			result += Arr[i] % 3 == 0 ? Arr[i] + " " : "";
		}
		scanner.close();
		System.out.println(result);
	}

}
