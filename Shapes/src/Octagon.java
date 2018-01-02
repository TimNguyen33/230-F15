
public class Octagon implements Shape {
	// A class to represent a regular octagon.
	
	// Initialize sidelength of 0.
	private double sideLength = 0;
	// Every octagon has eight sides.
	private int numberOfSides = 8;
	
	public void setSideLength(double sideLength) {
		// Each side has the same length.
		this.sideLength = sideLength;
	}
	
	public double getSideLength() {
		// Returns the sideLength for the octagon.
		return this.sideLength;
	}
	
	public int getNumSides() {
		// Returns 8.
		return this.numberOfSides;
	}
	
	public double getWidth() {
		// Returns the width at the widest part.
		double width = Math.round(sideLength + (2 * sideLength * 
				Math.sin(Math.PI / 4)));
		return width;
	}
	
	public double getHeight() {
		// The height calculation is identical to the width calculation.
		double height = Math.round(sideLength + (2 * sideLength * 
				Math.sin(Math.PI / 4)));
		return height;
	}
	
	public double getArea() {
		// Returns the area of this octagon.
		double area = Math.round(2 * Math.pow(sideLength, 2) * 
				(1 + Math.sqrt(2)));
		
		return area;
	}
	
	public double getPerimeter() {
		// Perimeter = sideLength * 8.
		return sideLength * 8;
	}
	
	public double getInteriorAngle() {
		// Returns the value of the interior angles in degrees.
		double angle = 180 * (numberOfSides - 2) / numberOfSides;
		return angle;
	}
	
	public static void main(String[] args) {
		// Test implementation of Shape.
		Shape o = new Octagon();
		o.setSideLength(5);
		double slength = o.getSideLength();
		int numSides = o.getNumSides();
		double width = o.getWidth();
		double height = o.getHeight();
		double area = o.getArea();
		double perimeter = o.getPerimeter();
		double angle = o.getInteriorAngle();
		
		System.out.println("Side length: " + slength);
		System.out.println("Number of sides: " + numSides);
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Interior angle: " + angle);
	}
}
