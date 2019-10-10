
public class Class_1 {
	int radius;
	String name;
	
	public Class_1() {
		radius = 1;
		name = "";
	}
	
	public Class_1(int r, String n) {
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
		
	public static void main(String[] args) {
		Class_1 pizza;
		pizza = new Class_1();
		pizza.radius = 10;
		pizza.name = "자바피자";
		System.out.println(pizza.name  + "의 면적은 " + pizza.getArea());
		
		Class_1 donut = new Class_1();
		donut.radius = 2;
		donut.name = "자바도넛";
		System.out.println(donut.name + "의 면적은 " + donut.getArea());
	}
}
