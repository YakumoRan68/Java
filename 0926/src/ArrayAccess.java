import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Arr[] = new int[5];
		int max = 0;
		System.out.println("��� 5���� �Է��ϼ���");
		
		//for(int i = 0; i < Arr.length; i++) {
		for(int i : Arr) { // �迭������ �Ҵ� �������� foreach ��� ����
			Arr[i] = scanner.nextInt();
			if (Arr[i] > max) max = Arr[i];
		}
		scanner.close();
		
		System.out.print("���� ū ���� : " + max + "\n");
		
		String f[] = {"���", "��", "�ٳ���", "ü��", "����", "����"};
		for(String str : f) System.out.println(str);
	}

}