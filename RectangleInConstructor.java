package Constructors;

public class RectangleInConstructor {
	

	    private double width;
	    private double height;

	    
	    public RectangleInConstructor(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    
	    public double calculatePerimeter() {
	        return 2 * (width + height);
	    }

	    public static void main(String[] args) {
	       
	    	RectangleInConstructor rectangle = new RectangleInConstructor(5, 3);

	       
	        double perimeter = rectangle.calculatePerimeter();
	        System.out.println("Perimeter of the rectangle: " + perimeter);
	    }
	}


