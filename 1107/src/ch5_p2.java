interface AdderInterface {
	int add(int x, int y);
	int add(int n);
}

class MyAdder {
	public int add(int x) { 
		int sum = 0;
		for(int i = 1; i <= x; i++) sum += i;
		return sum;
	}
	
	public int add(int x, int y) { return x + y; }
}

public class ch5_p2 {
	public static void main(String[] args) {
		MyAdder adder = new MyAdder();

		System.out.println(adder.add(5, 10));
		System.out.println(adder.add(10));
	}
}
