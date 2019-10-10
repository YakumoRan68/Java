
public class ch3_Bonus1 {

	public static void main(String[] args) {
		int Arr[][] = new int[3][4];
		
		int sum = 0;
		for(int[] i : Arr) {
			for(int j : i) {
				int x = (int)(Math.random() * 10);
				System.out.print(x + " ");
				i[j] = x;
				sum += x;
			}
			System.out.println();
			//System.out.println(i);
		}
		
		System.out.println("гую╨ " + sum);
	}

}
