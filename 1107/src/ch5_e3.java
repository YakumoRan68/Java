class Person { }
class Student extends Person { }
class StudentWorker extends Student {
	String job;
}
class Researcher extends Person { }
class Professor extends Researcher { }

class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person) {
			System.out.print("Person ");
			if (p instanceof StudentWorker) {
				((StudentWorker) p).job = "È¸»ç¿ø";
			}
		}
		if(p instanceof Student) {
			System.out.print("Student ");
		}
		if(p instanceof StudentWorker) {
			System.out.print("StudentWorker ");
		}
		if(p instanceof Researcher) {
			System.out.print("Researcher ");
		}
		if(p instanceof Professor) {
			System.out.print("Professor ");
		}
		System.out.println();
	}
}

public class ch5_e3 {
	public static void main(String[] args) {
		System.out.print("new Student() -> "); 
		System.out.print("new Researcher() -> "); 
		System.out.print("new Professor() -> "); 
	}
}
