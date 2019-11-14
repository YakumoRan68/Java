import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

public class ch5_p6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Object> List = new ArrayList<Object>();
		
		do {
			System.out.println("����(1), ����(2), ��� ����(3), ����(4)");
			int input = scanner.nextInt();
	
			if(input == 4) break;
			
			switch(input) {
			case 1: 
				System.out.println("���� ���� Line(1), Rect(2), Circle(3)");
				input = scanner.nextInt();
				switch(input) {
				case 1: List.add(new Line()); break;
				case 2: List.add(new Rect()); break;
				case 3: List.add(new Circle()); break;
				default : System.out.println("�߸��� �Է��Դϴ�!");
				}
				break;
			case 2:
				System.out.println("������ ������ ��ġ : ");
				input = scanner.nextInt();
				try {
					List.remove(input);
					System.out.println("�����Ǿ����ϴ�.");
				} catch (Exception e){
					System.out.println("������ �� �����ϴ�.");
				}
				break;
			case 3:
				for (Object Obj : List) { //�޼ҵ带 Ŭ������ ��ü���� �����ͼ� �����Ű�� ����.
					Class<? extends Object> cls = Obj.getClass();
					Object obj = null;
					try {
						obj = cls.newInstance();
					} catch (InstantiationException e1) {
						e1.printStackTrace();
					} catch (IllegalAccessException e1) {
						e1.printStackTrace();
					}
					Method methods[] = cls.getDeclaredMethods();
					for (Method method : methods) {
						try {
							method.invoke(obj);
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							e.printStackTrace();
						}
					}
				}
			}
			
		} while(true);
		
		System.out.println("���α׷��� �����մϴ�...");
		scanner.close();
	}
}
