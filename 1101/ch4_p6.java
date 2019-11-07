public class ch4_p6 {
	public static void main(String[] args) {
		Box a = new Box();
		Box b = new Box(20, 3);
		a.fill('*');
		b.fill('%');
		a.draw();
		b.draw();
	}
}
