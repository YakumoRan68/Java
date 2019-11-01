public class Box {
	private int width, height;
	private char fillChar;
	
	public Box() {
		draw(10, 1);
	}
	
	public void draw(int width, int height) {
		String str = "";
		for (int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) 
				str += "*";
			str += "\n";
		}
		System.out.print(str);
	}
}
