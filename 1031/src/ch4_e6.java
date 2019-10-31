class Circle {
	int radius;
	public Circle() {
		this(1);//this.radius = 1;
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() { 
		return 3.14 * radius * radius; 
	}
}

public class ch4_e6 {
	public static void main(String[] args) {
		Circle c[] = new Circle[5];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = new Circle(i);
			System.out.print((int)(c[i].getArea()) + " ");
		}
	}
}
