
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
		pizza.name = "�ڹ�����";
		System.out.println(pizza.name  + "�� ������ " + pizza.getArea());
		
		Class_1 donut = new Class_1();
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		System.out.println(donut.name + "�� ������ " + donut.getArea());
	}
}
