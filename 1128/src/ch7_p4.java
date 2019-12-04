import java.util.Scanner;
import java.util.Vector;

public class ch7_p4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Double> height = new Vector<Double>();
		Double maxDelta = 0.0;
		int IndexMaxDelta = 0;
		
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
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
		
		System.out.println("가장 키가 많이 자란 년도는 " + (2000 + IndexMaxDelta) + "년 " + maxDelta + "cm");
	}
}
