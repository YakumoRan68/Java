package ect;
import java.util.Scanner;


public class vendingMachine {
	static int[] prices = {500, 800, 1500};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input, selected, left;
		
		System.out.print("�ݾ� �Է�(��): ");
		input = scanner.nextInt();
		
		System.out.print("���Ḧ ������.\n[1] ����(500��) [2] �ݶ�(800��) [3] ��Ÿ�ο���(1500��) >> ");
		selected = scanner.nextInt();
		left = input - prices[selected-1];
		
		System.out.println("�Ž����� : " + left + "\nõ�� : " + left / 1000 + "��, ����� : " + (left % 1000) / 500 + "��, ��� : " + (left % 1000) % 500 / 100 + "��");
		
		scanner.close();
	}
}
