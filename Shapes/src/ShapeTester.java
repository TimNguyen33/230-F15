import java.util.ArrayList;


public class ShapeTester {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		// TODO each team should initialize 
		// a shape & add to shapes
		//Shape triangle = new Triangle();
		//shapes.add(triangle);
	    Shape circle = new Circle();
	    Shape triangle = new Triangle(10.5);
	    Shape pentagon = new Pentagon();
		Shape hexagon = new Hexagon();
		Shape square = new Square();
		Shape octagon = new Octagon();
		
		shapes.add(pentagon);
		shapes.add(hexagon);
		shapes.add(square);
		shapes.add(circle);
		shapes.add(triangle);
		shapes.add(octagon);
		
		
		
		for (Shape shape : shapes) {
			shape.setSideLength(5);
			String s = 	"---------- "+ shape.getClass() +" --------- \n";
			
			s +=			"Side Length: " + shape.getSideLength()+"\n";
			s +=			"Num sides:   " + shape.getNumSides()+"\n";
			s += 	 	"Area: 		  " + shape.getArea()+"\n";
			s += 	 	"Perimeter: 	  " + shape.getPerimeter()+"\n";
			s +=			"Height:		  " + shape.getHeight()+"\n";
			s +=			"Width:		  " + shape.getWidth()+"\n";
			s +=			"Angle:		  " + shape.getInteriorAngle()+"\n";
			s +=			"New Length:  " + shape.getSideLength()+"\n";
			//s +=			"-------------------------------------";
			System.out.println(s);
		}
		
	}

}
