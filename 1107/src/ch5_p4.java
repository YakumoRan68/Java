class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point {
	public String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setPoint(int x, int y) {
		move(x, y);
	}
	
	public void setColor(String s) {
		this.color = s;
	}
	
	public void show() {
		System.out.println(color + "»öÀ¸·Î (" + getX() + "," + getY() + ")" );
	}
}

public class ch5_p4 {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
	}
}
