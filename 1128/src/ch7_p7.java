import java.util.ArrayList;
import java.util.Scanner;

class Location {
	int x, y;
	public Location(int x, int y) {
		this.x = x; this.y = y;
	}
}

public class ch7_p7 {
	public static Double GetDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Location> Points = new ArrayList<Location>();
		int x = 0, y = 0;
		Double total = 0.0;
		
		System.out.println("쥐가 이동한 위차(x, y)를 5개 입력하라.");
		for(int i = 0; i < 5; i++) {
			Points.add(new Location(scanner.nextInt(), scanner.nextInt()));
			int toX = Points.get(i).x, toY = Points.get(i).y;
			total += GetDistance(x, y, toX, toY);
			x = toX; y = toY;
		}
		
		scanner.close();
		
		total += GetDistance(x, y, 0, 0);
		System.out.println("총 이동 거리는 " + total);
	}
}
