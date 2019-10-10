import java.util.Scanner;

public class ch2_p4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y;
		
		System.out.print("점 x,y의 좌표를 입력하세요 : ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println("점(" + x + ", " + y + ")은 (50, 50)과 (100, 100)의 사각형 내에 " + (x >= 50 && x <= 100 && y >= 50 && y <= 100 ? "있" : "없") + "습니다." );
		scanner.close();
	}
}
