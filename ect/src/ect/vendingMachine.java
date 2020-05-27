package ect;
import java.util.Scanner;


public class vendingMachine {
	static int[] prices = {500, 800, 1500};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input, selected, left;
		
		System.out.print("금액 입력(원): ");
		input = scanner.nextInt();
		
		System.out.print("음료를 고르세요.\n[1] 생수(500원) [2] 콜라(800원) [3] 비타민워터(1500원) >> ");
		selected = scanner.nextInt();
		left = input - prices[selected-1];
		
		System.out.println("거스럼돈 : " + left + "\n천원 : " + left / 1000 + "개, 오백원 : " + (left % 1000) / 500 + "개, 백원 : " + (left % 1000) % 500 / 100 + "개");
		
		scanner.close();
	}
}
