import java.util.Scanner;

public class ch2_p8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ŀ�� �ֹ��ϼ��� : ");
		String a = scanner.next();	
		int price = 1;
		switch(a) {
			case "����������" : price = 2000; break;
			case "�Ƹ޸�ī��" : price = 2500; break;
			case "īǪġ��" : price = 3000; break;
			case "ī���" : price = 3500; break;
			default : System.out.println("�߸��� �Է�");
		}
		System.out.println(price * scanner.nextInt() + "���Դϴ�");
		scanner.close();
	}
}
