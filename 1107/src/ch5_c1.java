import java.util.Scanner;

public class ch5_c1 {
	static byte next = 0; //LRUD
	static int width = 20;
	static int height = 10;

	static class Bear extends GameObject {
		public Bear() {
			super(0, 0, 1);
		}
		
		public void move() {
			if(next == 1) this.x -= distance;
			else if(next == 2) this.x += distance;
			else if(next == 3) this.y += distance;
			else this.y -= distance;
		}
		
		public char getShape() { return 'b'; }
	}
	
	static class Fish extends GameObject {
		public Fish() {
			super((int)(Math.random() * width), (int)(Math.random() * height), 1);
			//super(5,6,1);
		}
		
		public void move() { 
			int next = (int)(Math.random() * 4);
			if(next == 0) this.x -= distance;
			else if(next == 1) this.x += distance;
			else if(next == 2) this.y += distance;
			else this.y -= distance;
		}
		
		public char getShape() { return '@'; }
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Fish fish = new Fish();
		Bear bear = new Bear();
		
		while(true) {
			String str = "";
			for(int y = 0; y < height; y++) {
				for(int x = 0; x < width; x++) 
					str += (x == bear.getX() && y == bear.getY()) ? bear.getShape() : (x == fish.getX() && y == fish.getY()) ? fish.getShape() : '-';
				str += "\n";
			}
			
			System.out.print("위w, 왼쪽a, 아래s, 오른쪽d\n\n");
			System.out.print(str);
			
			if (bear.collide(fish)) break;
			
			switch(scanner.next()) {
			case "a" : next = 1; break;
			case "d" : next = 2; break;
			case "w" : next = 3; break;
			case "s" : next = 4; break;
			default : next = 0;
			}
			
			if (next == 0) System.out.println("잘못된 입력입니다!");
			else {
				fish.move();
				bear.move();
			}
		}
		
		System.out.println("Bear Wins!!");
		scanner.close();
	}
}
