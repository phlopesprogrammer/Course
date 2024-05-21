package entities;

public class Retangle {

	public double width;
	public double height;

	public double area() {
		return width * height;
		
	}

	public double perimeter() {
		return width + width + height + height;
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + (Math.pow(height, 2)));
	}

}
