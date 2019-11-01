class Circle {
	private int radius;
	public Circle(int radius) { this.radius = radius; }
	public int getRadius() { return radius; }
	public void setRadius(int radius) { this.radius = radius; }
}

class CircleManager {
	static void copy(Circle src, Circle dest) {
		dest.setRadius(src.getRadius());
	}
	
	static boolean equals(Circle a, Circle b) {
		return a.getRadius() == b.getRadius();
	}
}

public class ch4_p5 {
	public static void main(String[] args) {
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(1);
		
		System.out.println("pizza와 waffle 크기 " + (CircleManager.equals(pizza, waffle) ? "같음" : "다름"));
		
		CircleManager.copy(pizza, waffle);
		
		System.out.println("pizza와 waffle 크기 " + (CircleManager.equals(pizza, waffle) ? "같음" : "다름"));
	}
}
