import java.util.Scanner;

public class ch6_p6 {
	static String[] role = {"����", "����", "��"};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int my;
		
		do {
			System.out.println("����(1), ����(2), ��(3), ������(4)");
			my = scanner.nextInt() - 1;
			if(my == 3) break;
			
			int com = (int)(Math.random() * 3);
			
            String str = "����� " + role[my] + " : ��ǻ�� " + role[com] + "\n����ڰ� ";
            if (my == com) str += "���";
            else str += (my + 1) % 3 == com ? "�̰�" : "��";
            str += "���ϴ�.";
            
            System.out.println(str);
            
		} while(true);
		scanner.close();
		System.out.print("������ �����մϴ�...");
	}
}
