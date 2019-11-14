class MyPoint {
	int a, b;
	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public String toString() {
		return "MyPoint("+a+","+b+")";
	}
}

public class ch6_p1 {
	public static void main(String[] args) {
		MyPoint a = new MyPoint(3, 20);
		System.out.print(a);
	}
}
