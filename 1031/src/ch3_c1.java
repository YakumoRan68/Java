import java.util.Scanner;

public class ch3_c1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Min, Max, count, Input, answer;
		
		while(true) {
			System.out.println("Up & Down게임입니다. 숨겨진 수를 맞추어 보세요.");
			Min = 0; Max = 99; count = 1;
			answer = (int)(Math.random() * 100);
			while(true) {
				System.out.print(Min + "-" + Max + "\n" + count + ">>");
				Input = scanner.nextInt();
				
				if(Input == answer) break;
				else if(Input > answer) {
					System.out.println("더 낮게");
					Max = Max < Input ? Max : Input;
				}
				else {
					System.out.println("더 높게");
					Min = Min > Input ? Min : Input;
				}
			}
			System.out.print("맞았습니다.\n다시하시겠습니까?(y/n)>>");
			if(scanner.next().equals("n")) break;
		}
		scanner.close();
	}
}
