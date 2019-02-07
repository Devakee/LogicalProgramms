package demoPackage;

public class Polymorphism {

	// Overridden method
	public void disp() {
		System.out.println("disp() method of parent class");
	}
}

class Demo extends Polymorphism {
	// Overriding method
	public void disp() {
		System.out.println("disp() method of Child class");
	}

	public void newMethod() {
		System.out.println("new method of child class");
	}

	public static void main(String args[]) {
		
		Polymorphism obj = new Polymorphism();
		obj.disp();

		/*
		 * When parent class reference refers to the child class object then the
		 * overriding method (method of child class) is called. This is called dynamic
		 * method dispatch and runtime polymorphism
		 */
		Polymorphism obj2 = new Demo();
		obj2.disp();
	}
}
