import java.util.Scanner;
import java.util.Vector;

public class ch7_p4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Double> height = new Vector<Double>();
		Double maxDelta = 0.0;
		int IndexMaxDelta = 0;
		
		System.out.println("2000~2009����� 1�� ������ Ű(cm)�� �Է�");
		height.add(scanner.nextDouble());
		for(int i = 1; i < 10; i++) {
			Double input = scanner.nextDouble();
			height.add(input);
			Double delta = height.get(i) - height.get(i - 1);
			if (maxDelta < delta) {
				IndexMaxDelta = i - 1;
				maxDelta = delta;
			}
		}
		scanner.close();
		
		System.out.println("���� Ű�� ���� �ڶ� �⵵�� " + (2000 + IndexMaxDelta) + "�� " + maxDelta + "cm");
	}
}
