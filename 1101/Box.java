public class Box {
	private int width, height;
	private char fillChar = ' ';
	
	public Box() {
		this.width = 10;
		this.height = 1;
	}
	
	public Box(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		String str = "";
		for (int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) 
				str += fillChar;
			str += "\n";
		}
		System.out.print(str);
	}
	
	public void fill(char c) {
		fillChar = c;
	}
}
