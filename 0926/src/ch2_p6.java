import java.util.Scanner;

public class ch2_p6 {
	static int P[] = {50000, 10000, 1000, 500, 100, 10, 1};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �׼��� �Է��ϼ��� : ");
		int money = scanner.nextInt();
		
		for(int i : P) {
			int x = money / i;
			if(x > 0) {
				System.out.print((i == 50000 ? "" : ", ") + i + "��" + x + "��");
				money %= i;
			}
		}
		scanner.close();
	}
}
