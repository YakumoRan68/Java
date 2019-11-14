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
			System.out.println("삽입(1), 삭제(2), 모두 보기(3), 종료(4)");
			int input = scanner.nextInt();
	
			if(input == 4) break;
			
			switch(input) {
			case 1: 
				System.out.println("도형 종류 Line(1), Rect(2), Circle(3)");
				input = scanner.nextInt();
				switch(input) {
				case 1: List.add(new Line()); break;
				case 2: List.add(new Rect()); break;
				case 3: List.add(new Circle()); break;
				default : System.out.println("잘못된 입력입니다!");
				}
				break;
			case 2:
				System.out.println("삭제할 도형의 위치 : ");
				input = scanner.nextInt();
				try {
					List.remove(input);
					System.out.println("삭제되었습니다.");
				} catch (Exception e){
					System.out.println("삭제할 수 없습니다.");
				}
				break;
			case 3:
				for (Object Obj : List) { //메소드를 클래스형 객체에서 가져와서 실행시키는 예시.
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
		
		System.out.println("프로그램을 종료합니다...");
		scanner.close();
	}
}
