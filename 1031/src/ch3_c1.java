import java.util.Scanner;

public class ch3_c1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Min, Max, count, Input, answer;
		
		while(true) {
			System.out.println("Up & Down�����Դϴ�. ������ ���� ���߾� ������.");
			Min = 0; Max = 99; count = 1;
			answer = (int)(Math.random() * 100);
			while(true) {
				System.out.print(Min + "-" + Max + "\n" + count + ">>");
				Input = scanner.nextInt();
				
				if(Input == answer) break;
				else if(Input > answer) {
					System.out.println("�� ����");
					Max = Max < Input ? Max : Input;
				}
				else {
					System.out.println("�� ����");
					Min = Min > Input ? Min : Input;
				}
			}
			System.out.print("�¾ҽ��ϴ�.\n�ٽ��Ͻðڽ��ϱ�?(y/n)>>");
			if(scanner.next().equals("n")) break;
		}
		scanner.close();
	}
}
