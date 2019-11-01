import java.util.Scanner;

class Rect {
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
}

public class ch4_p3 {
	static int NUMARRAY = 4;
	
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		Rect[] Rectangles = new Rect[NUMARRAY];
		
		for(int i = 0; i < NUMARRAY; i++) {
			System.out.print(i + 1 + " 너비와 높이 : ");
			Rectangles[i] = new Rect(scanner.nextInt(), scanner.nextInt());
		}
		scanner.close();
		System.out.println("저장하였습니다...");
		
		int sum = 0;
		for(Rect i : Rectangles) {
			sum += i.getArea();
		}
		
		System.out.println("사각형 전체 합은 " + sum);		
	}
}
