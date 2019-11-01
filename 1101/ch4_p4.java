import java.util.Scanner;

public class ch4_p4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int num = scanner.nextInt();
		Phone[] PhoneManager = new Phone[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�) : ");
			PhoneManager[i] = new Phone(scanner.next(), scanner.next());
		}
		System.out.println("����Ǿ����ϴ�...");
		
		String name;
		do {
			System.out.print("�˻��� �̸� : ");
			name = scanner.next();
			if (name.equals("exit")) break;
			
			Boolean HasFound = false;
			for(Phone inst : PhoneManager) {
				if (inst.getName().equals(name)) {
					System.out.println(inst.getName() + "���� ��ȭ��ȣ�� " + inst.getTel() + "�Դϴ�.");
					HasFound = true;
					break;
				}
			}
			if (!HasFound) System.out.println(name + "���� �����ϴ�.");
		} while(!name.equals("exit"));
		
		System.out.print("���α׷��� �����մϴ�.");
		scanner.close();
	}
}
