
public class Circle {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
		
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		System.out.println(pizza.name  + "�� ������ " + pizza.getArea());
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		System.out.println(donut.name + "�� ������ " + donut.getArea());
	}
}
