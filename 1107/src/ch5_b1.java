interface Shape2 {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("--- 다시 그립니다. ---");
		draw();
	}
}

class Circle2 implements Shape2 {
	int radius;
	public Circle2(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.print("반지름 " + radius + " ");
	}
	
	public double getArea() {
		return radius * radius * Shape2.PI;
	}
}

public class ch5_b1 {
	public static void main(String[] args) {
		Shape2 coin = new Circle2(10);
		coin.redraw();
		System.out.println("코인의 면적은 " + coin.getArea());
	}

}
