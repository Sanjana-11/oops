package inheritance;


class Animal1{
	void eat() {
		System.out.println("eating");
	}
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("barking");
	}
}

class babyDog extends Dog1{
	void weep() {
		System.out.println("weeping");
	}
}

public class TestInheritance {
	public static void main(String[] args) {
		babyDog b = new babyDog();
		b.weep();
		b.bark();
		b.eat();
	}
}
