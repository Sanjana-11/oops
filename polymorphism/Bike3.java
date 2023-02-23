package polymorphism;

class Bike3 {
	int speed;

	Bike3() {
		System.out.println("speed is " + speed);
	}

	{speed = 100;}

	public static void main(String args[]) {
		Bike3 b1 = new Bike3();
		Bike3 b2 = new Bike3();
	}
}