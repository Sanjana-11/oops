package Abstraction;

interface Drawable{
	void draw();
}

class Rectangle implements Drawable{
	public void draw() {
		System.out.println("drawing Rectangle");
	}
}

class Circle implements Drawable{
	public void draw() {
		System.out.println("drawing Circle");
	}
}


public class Interface1 {
	public static void main(String[] args) {
		Drawable r = new Rectangle();
		r.draw();
	}
}
