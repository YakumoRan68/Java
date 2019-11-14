import java.util.ArrayList;
import java.util.Scanner;

interface StackInterface {
	int length();
	String pop();
	void push(String ob);
}

class StringStack {
	ArrayList<String> stack = new ArrayList<String>();
	public void push(String ob) {
		stack.add(ob);
	}
	
	public String pop() {
		return stack.remove(stack.size() - 1); //List¿« ≈©±‚ = List.size()
	}
}

public class ch5_p5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringStack stack = new StringStack();
		
		for(int i = 0; i < 5; i++) {
			stack.push(scanner.next());
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print(stack.pop() + " ");
		}
		
		scanner.close();
	}
}
