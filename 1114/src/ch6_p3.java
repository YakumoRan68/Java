public class ch6_p3 {
	public static void main(String[] args) {
		int x[] = new int[3];
		do {
			for(int i = 0; i < 3; i++) {
				x[i] = (int)(Math.random() * 3 + 1);
				System.out.print(x[i] + "\t");
			}
			System.out.println();
		} while(x[0] != x[1] || x[1] != x[2]);
		System.out.println("����");
	}
}
